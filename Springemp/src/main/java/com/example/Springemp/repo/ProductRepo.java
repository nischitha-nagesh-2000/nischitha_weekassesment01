package com.example.Springemp.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Springemp.entity.product;

public interface ProductRepo extends JpaRepository<product, Integer> {

}
