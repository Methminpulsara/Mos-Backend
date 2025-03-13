package edu.icet.ecom.service;

import edu.icet.ecom.model.Customer;

import java.util.List;



public interface CustomerService {

    void add(Customer customer);
    Customer searchByNumber(String number);
    List<Customer> getAll();
    void delete(Integer id );

}
