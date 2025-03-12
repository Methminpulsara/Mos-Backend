package edu.icet.ecom.controller.product;


import edu.icet.ecom.entity.Product_entity;
import edu.icet.ecom.model.Product;
import edu.icet.ecom.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/product")

public class ProductController {

    final ProductService productService;
    final ModelMapper mapper;


    @GetMapping("/getAll")
    public List<Product> getAll() {
        List<Product> all = productService.getAll();
        return all;
    }

    @GetMapping("/find/products/{name}")
    public List<Product> getByName(@PathVariable String name) {
        List<Product_entity> productEntities = productService.getShortByname(name);

        return productEntities.stream()
                .map(productEntity -> mapper.map(productEntity, Product.class))
                .collect(Collectors.toList());
    }
}
