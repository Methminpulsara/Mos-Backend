package edu.icet.ecom.service.impl;

import edu.icet.ecom.entity.Cart_entity;
import edu.icet.ecom.model.Cart;
import edu.icet.ecom.repository.Cart_repository;
import edu.icet.ecom.service.CartService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
@RequiredArgsConstructor
@Service
public class CartService_impl implements CartService {

    final Cart_repository repository;
    final ModelMapper mapper;


    @Override
    public void add(Cart cart) {
        repository.save(mapper.map(cart, Cart_entity.class));
    }

    @Override
    public List<Cart> getAll() {
        List<Cart_entity> all = repository.findAllNotPlacedCarts();
        List<Cart> carts = new ArrayList<>();
        all.forEach(cartEntity -> {
            carts.add(mapper.map(cartEntity, Cart.class));
        });
        return carts;

    }

    @Override
    public List<Cart_entity> searchProductID(@RequestParam String name) {
        return repository.findByName(name);

    }

    @Override
    @Transactional
    public void updateQty(Integer productID, Integer qty) {
        repository.updateQuantity(productID,qty);
    }


}
