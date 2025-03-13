package edu.icet.ecom.service.impl;

import edu.icet.ecom.entity.Customer_entity;
import edu.icet.ecom.model.Customer;
import edu.icet.ecom.repository.Customer_repository;
import edu.icet.ecom.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class CustomerService_impl implements CustomerService {

   final Customer_repository repository;
   final ModelMapper mapper;


    @Override
    public void add(Customer customer) {
        repository.save(mapper.map(customer, Customer_entity.class));
    }

    @Override
    public Customer searchByNumber(String number) {
        return mapper.map(repository.findByNumber(number), Customer.class);
    }

    @Override
    public List<Customer> getAll() {
        List<Customer_entity> all = repository.findAll();
        List<Customer> customerList = new ArrayList<>();
        all.forEach(customerEntity -> {
            customerList.add(mapper.map(customerEntity,Customer.class));
        });
        return customerList;
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Customer searchById(Integer id) {
       return mapper.map(repository.findById(id), Customer.class);
    }

    @Override
    public void updateCustomer(Customer customer) {
        repository.save(mapper.map(customer, Customer_entity.class));
    }


}
