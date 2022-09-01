package com.storage.storageserviceimage.service;

import com.storage.storageserviceimage.entity.FileData;
import com.storage.storageserviceimage.entity.ImageData;
import com.storage.storageserviceimage.repository.FileDataRepository;
import com.storage.storageserviceimage.repository.StorageRepository;
import com.storage.storageserviceimage.util.ImageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Optional;

@Service
public class StorageService {

    @Autowired
    private StorageRepository storageRepository;

    @Autowired
    private FileDataRepository fileDataRepository;

    private final String FOLDER_PATH="C:/SpringFolder/storage-service-image/Images/";

    public String uploadImage(MultipartFile file) throws IOException {

        ImageData imageData = storageRepository.save(ImageData
                .builder()
                .name(file.getOriginalFilename())
                .type(file.getContentType())
                .imageData(ImageUtils.compressImage(file.getBytes()))
                .build());

        if (imageData!= null){
            return "file uploaded successfully..."+file.getOriginalFilename();
        }
        return null;

    }

    //download image

    public byte[] downloadImage(String fileName){
        Optional<ImageData> dbImageData = storageRepository.findByName(fileName);
        byte[] images = ImageUtils.decompressImage(dbImageData.get().getImageData());

        return images;
    }

    ///using filedata ....-------------------------------------------------------------


    public String uploadImageToFileSystem(MultipartFile file) throws IOException {

        String filePath = FOLDER_PATH+file.getOriginalFilename();
       FileData fileData= fileDataRepository.save(FileData.builder()
                        .name(file.getOriginalFilename())
                        .type(file.getContentType())
                        .filePath(filePath)
                         .build());

       //transfer copy of image
        file.transferTo(new File(filePath));


        if (fileData!= null){
            return "file uploaded successfully..."+ filePath;
        }
        return null;

    }

    //download image to folder

    public byte[] downloadImageFromFileSystem(String fileName) throws IOException {
        Optional<FileData> dbFileData = fileDataRepository.findByName(fileName);

        String filePath = dbFileData.get().getFilePath();
        byte[] images = Files.readAllBytes(new File(filePath).toPath());

        return images;
    }
}
