package edu.icet.ecom.controller;


import edu.icet.ecom.entity.Order_entity;
import edu.icet.ecom.model.Order;
import edu.icet.ecom.model.Product;
import edu.icet.ecom.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;
import  java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
@CrossOrigin

public class OrderController {

    final OrderService service;
    final ModelMapper mapper;

    @PostMapping("/add")
    public void add(@RequestBody Order order){
        service.add(order);
    }

    @GetMapping("/getall")
    public List<Order> getAll(){
        return service.getAll();
    }

    @GetMapping("/serchbyid/{id}")
    public List<Order> getbyID(@PathVariable  Integer id){

        List<Order_entity> orderEntities = service.search(id);
        List <Order> orderList = new ArrayList<>();
        orderEntities.forEach(orderEntity -> {
            orderList.add(mapper.map(orderEntity,Order.class));
        });
        return orderList;
    }
}
