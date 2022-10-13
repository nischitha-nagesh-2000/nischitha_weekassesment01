package com.example.Springemp.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Springemp.entity.Helpdesk;

public interface DeskRepo extends JpaRepository<Helpdesk, Integer> {

}

