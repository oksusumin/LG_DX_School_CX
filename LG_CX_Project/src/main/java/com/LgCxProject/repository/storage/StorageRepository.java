package com.LgCxProject.repository.storage;

import com.LgCxProject.domain.storage.Storage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface StorageRepository extends JpaRepository<Storage, String> {

    @Query(value = "select * from tb_storage where storage_id =:storageId",nativeQuery = true)
    Optional<Storage> findStorageByStorageId(@Param(value="storageId") String storageId);

}
