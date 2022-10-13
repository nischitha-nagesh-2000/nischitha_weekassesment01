package com.example.Springemp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Springemp.entity.userEntity;

public interface userRepo extends JpaRepository<userEntity, Integer> {

}