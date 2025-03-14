package edu.icet.ecom.service;

import edu.icet.ecom.entity.Order_entity;
import edu.icet.ecom.model.Order;
import java.util.List;
public interface OrderService {

    void add(Order order);
    List<Order> getAll();
    List <Order_entity> search (Integer id);

}
