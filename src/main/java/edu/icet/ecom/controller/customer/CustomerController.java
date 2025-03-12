package edu.icet.ecom.controller.customer;


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

    @PostMapping("/add")
    public void add(@RequestBody Customer customer){
        service.add(customer);
    }

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

}
