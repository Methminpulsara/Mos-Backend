package edu.icet.ecom.controller;


import edu.icet.ecom.model.Customer;
import edu.icet.ecom.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {


    final CustomerService service;
    @GetMapping("/searphonenumber/{number}")
    public Customer searchBynumber(@PathVariable String number){
        return service.searchByNumber(number);
    }

    @GetMapping("/allcustomer")
    List<Customer> getAll(){
        return service.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCustomer (@PathVariable Integer id){
        service.delete(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody Customer custoemr){
        service.add(custoemr);
    }

    @GetMapping("/search/by/{id}")
    public Customer searc(@PathVariable Integer id ){
        return service.searchById(id);
    }

    @PutMapping("/updatecustomer")
    public void update(@RequestBody Customer customer){
        service.add(customer);
    }
}
