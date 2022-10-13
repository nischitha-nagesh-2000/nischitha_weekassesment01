package com.example.Springemp.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Springemp.entity.Helpdesk;
import com.example.Springemp.repo.DeskRepo;

@CrossOrigin
@RestController


public class controllerHelpdesk {
	@Autowired
	DeskRepo deskRepo;
    
    @PostMapping("/adddesk")
    public Helpdesk createHelpDesk(@RequestBody Helpdesk helpdesk) {
        return deskRepo.save(helpdesk);
    }
    @GetMapping("/getdesk")
    public List<Helpdesk> getAllDesk(){
        
        return deskRepo.findAll();     //select * from product;
    }    

}


