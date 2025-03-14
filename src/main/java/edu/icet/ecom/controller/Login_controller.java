package edu.icet.ecom.controller;


import edu.icet.ecom.model.Login;
import edu.icet.ecom.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login/burgerShop")
@RequiredArgsConstructor
@CrossOrigin
public class Login_controller {

    final LoginService service;
    final ModelMapper mapper;

    @PostMapping("/singin")
    public void add(@RequestBody Login login){
        service.add(login);
    }

    @GetMapping("/search/{email}")
    public Login search (@PathVariable String email){
        return service.search(email);
    }
    
}
