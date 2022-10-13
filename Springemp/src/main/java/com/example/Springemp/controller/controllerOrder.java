package com.example.Springemp.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Springemp.entity.order;
import com.example.Springemp.repo.OrderRepo;

@CrossOrigin
@RestController


public class controllerOrder {
	@Autowired
	OrderRepo orderRepo;
//    @RequestMapping("/hello")      //REST API End Point
//    public String process() {
//        
//        return "<Marquee><H1>Hello Team ,Start working hard !!!!</H1></Marquee>";
//        
//    }
    @PostMapping("/addorders")
    public order createorder(@RequestBody order order) {
        return orderRepo.save(order);
    }
    @GetMapping("/getorders")
    public List<order> getAllOrders(){
        
        return orderRepo.findAll();     //select * from product;
    }    

}

