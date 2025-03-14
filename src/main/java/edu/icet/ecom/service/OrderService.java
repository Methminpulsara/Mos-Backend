package edu.icet.ecom.service;

import edu.icet.ecom.model.Order;
import java.util.List;
public interface OrderService {

    void add(Order order);
    List<Order> getAll();

}
