package com.example.Springemp.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Springemp.entity.ImageData;

import java.util.Optional;

public interface StorageRepository extends JpaRepository<ImageData, Long> {

	Optional<ImageData> findByName(String fileName);
}