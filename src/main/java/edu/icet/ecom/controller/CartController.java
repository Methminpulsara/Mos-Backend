package edu.icet.ecom.controller;


import edu.icet.ecom.entity.Cart_entity;
import edu.icet.ecom.model.Cart;
import edu.icet.ecom.service.CartService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cart")
@CrossOrigin
@RequiredArgsConstructor

public class CartController {

   final CartService service;
    final ModelMapper mapper;

    @PostMapping("/addcart")
    public void add(@RequestBody Cart cart) {
        service.add(cart);

    }

    @GetMapping("/cartproduct")
    List<Cart> getAll (){
        return service.getAll();
    }

    @GetMapping("/searchProductID/{name}")
    public List<Cart> searchProductID(@PathVariable("name") String name) {
        List<Cart_entity> productEntities = service.searchProductID(name);

        return productEntities.stream()
                .map(productEntity -> mapper.map(productEntity, Cart.class))
                .collect(Collectors.toList());
    }

    @PutMapping("/{productID}/{qty}")
    void updateQty(@PathVariable Integer productID , @PathVariable Integer qty){
        service.updateQty(productID,qty);
    }

    @DeleteMapping("/delete/All")
    public void deletePlacedOrders(){
        service.deleteAll();
    }
    
    @DeleteMapping("/delete/{productId}")
    public void delete(@PathVariable Integer productId){
        service.deleteByProductID(productId);
    }


}
