package com.example.Springemp.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Springemp.entity.userEntity;
import com.example.Springemp.repo.userRepo;

@CrossOrigin
@RestController


public class userController {
	@Autowired
	userRepo userRepo;
    
    @PostMapping("/adduserentity")
    public userEntity createuser(@RequestBody userEntity user) {
        return userRepo.save(user);
    }
    @GetMapping("/getuserentity")
    public List<userEntity> getAlluserEntity(){
        
        return userRepo.findAll();     //select * from product;
    } 
    
    @DeleteMapping("/deleteusers/{id}")
    public String  deleteUser(@PathVariable("id") int id)
    {
       
        userRepo.deleteById(id);
        System.out.println("Records got deleted");
        return  "Is deleted";
    }
    @DeleteMapping("/deleteusers/{id1}/{id2}")
    public String  deleteUsers(@PathVariable("id1") int id1,@PathVariable("id2") int id2)
    {
       
        userRepo.deleteById(id1);
        System.out.println("Record 1 deleted");
        userRepo.deleteById(id2);
        System.out.println("Record 2 deleted");
        return  "Is deleted";
    }
    
    @PutMapping("/users/{id}")   //

    public ResponseEntity<userEntity> updateUser(@PathVariable ("id") int id, @RequestBody userEntity userbypostman){

        userEntity user = userRepo.findById(id)

                .orElseThrow(() -> new RuntimeException("User not exist with id :" + id));

        

        user.setId(userbypostman.getId());

        user.setName(userbypostman.getName());

        user.setEmail(userbypostman.getEmail());

        user.setPassword(userbypostman.getPassword());

        

        userEntity updatedUser = userRepo.save(user);

        return ResponseEntity.ok(updatedUser);

    }



}
