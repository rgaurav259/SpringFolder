package com.storage.storageserviceimage.repository;

import com.storage.storageserviceimage.entity.FileData;
import com.storage.storageserviceimage.entity.ImageData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FileDataRepository extends JpaRepository<FileData,Long> {
    Optional<FileData> findByName(String fileName);
}
