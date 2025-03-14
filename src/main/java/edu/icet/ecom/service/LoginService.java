package edu.icet.ecom.service;

import edu.icet.ecom.model.Login;

public interface LoginService {

    void add (Login login);
    Login search(String email , String password);
}
