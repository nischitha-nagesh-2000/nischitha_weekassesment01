package com.example.Springemp.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Springemp.entity.order;

public interface OrderRepo extends JpaRepository<order, Integer> {

}
