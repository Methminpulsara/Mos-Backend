package edu.icet.ecom.controller;


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


    @PostMapping("/add")
    public void add (@RequestBody Product product){
        productService.add(product);
    }

    @PutMapping("/update")
    public void update (@RequestBody Product product){
        productService.update(product);
    }
    @DeleteMapping("/delete")
    public void delete (@PathVariable Integer id){
        productService.delete(id);
    }

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
