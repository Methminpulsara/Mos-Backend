package edu.icet.ecom.service.impl;

import edu.icet.ecom.entity.Login_entity;
import edu.icet.ecom.model.Login;
import edu.icet.ecom.repository.Login_repository;
import edu.icet.ecom.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class LoginService_impl implements LoginService {

    final Login_repository repository;
    final ModelMapper mapper;

    @Override
    public void add(Login login) {
        repository.save(mapper.map(login, Login_entity.class));
    }

    @Override
    public Login search(String email, String password) {
        return mapper.map(repository.findByEmailAndPassword(email,password), Login.class);
    }
}
