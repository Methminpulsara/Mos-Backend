package edu.icet.ecom.controller.order;


import edu.icet.ecom.model.Order;
import edu.icet.ecom.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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
}
