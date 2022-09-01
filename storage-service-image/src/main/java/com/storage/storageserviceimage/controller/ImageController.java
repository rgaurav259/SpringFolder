package com.storage.storageserviceimage.controller;

import com.storage.storageserviceimage.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/image")
public class ImageController {



    @Autowired
    private StorageService service;





    @PostMapping
    public ResponseEntity<?> uploadImage(@RequestParam("image") MultipartFile file) throws IOException {

        String uploadImage = service.uploadImage(file);
        return ResponseEntity.status(HttpStatus.OK).body(uploadImage);

    }

    //downloading

    @GetMapping("/{fileName}")
    public ResponseEntity<?> downloadImage(@PathVariable String fileName){
        byte[] downloadImage = service.downloadImage(fileName);

        return ResponseEntity.status(HttpStatus.OK)
                .contentType(MediaType.valueOf("image/png"))
                .body(downloadImage);


    }

    //above two methods controller directly stored in db ,but we hvae to store in db as well as local.then.?


    @PostMapping("/fileSystem")
    public ResponseEntity<?> uploadImageToFileData(@RequestParam("image") MultipartFile file) throws IOException {

        String uploadImage = service.uploadImageToFileSystem(file);
        return ResponseEntity.status(HttpStatus.OK).body(uploadImage);

    }


    //downloading

    @GetMapping("/fileSystem/{fileName}")
    public ResponseEntity<?> downloadImageFromFolderToDb(@PathVariable String fileName) throws IOException {
        byte[] downloadImage = service.downloadImageFromFileSystem(fileName);

        return ResponseEntity.status(HttpStatus.OK)
                .contentType(MediaType.valueOf("image/png"))
                .body(downloadImage);


    }




}
