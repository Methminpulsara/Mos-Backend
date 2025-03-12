package edu.icet.ecom.service;

import edu.icet.ecom.entity.Cart_entity;
import edu.icet.ecom.model.Cart;

import java.util.List;

public interface CartService {

    void add (Cart cart);
    List <Cart> getAll();
    List<Cart_entity> searchProductID(String name);
    void updateQty(Integer productID , Integer qty);


}
