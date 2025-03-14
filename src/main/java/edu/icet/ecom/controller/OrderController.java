package edu.icet.ecom.controller;


import edu.icet.ecom.model.Order;
import edu.icet.ecom.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import  java.util.*;
@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
@CrossOrigin

public class OrderController {

    final OrderService service;

    @PostMapping("/add")
    public void add(@RequestBody Order order){
        service.add(order);
    }

    @GetMapping("/getall")
    public List<Order> getAll(){
        return service.getAll();
    }
}
