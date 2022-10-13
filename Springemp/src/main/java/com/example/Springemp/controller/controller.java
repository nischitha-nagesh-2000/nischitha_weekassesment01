package com.example.Springemp.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Springemp.entity.product;
import com.example.Springemp.repo.ProductRepo;

@CrossOrigin
@RestController


public class controller {
	@Autowired
	ProductRepo productRepo;
    @RequestMapping("/hello")      //REST API End Point
    public String process() {
        
        return "<Marquee><H1>Hello Team ,Start working hard !!!!</H1></Marquee>";
         
    }
    @PostMapping("/addproduct")
    public product createproduct(@RequestBody product product) {
        return productRepo.save(product);
    }
    @GetMapping("/getproducts")
    public List<product> getAllProducts(){
        
        return productRepo.findAll();     //select * from product;
    }    

}
