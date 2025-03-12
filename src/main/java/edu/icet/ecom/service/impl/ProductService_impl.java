package edu.icet.ecom.service.impl;

import edu.icet.ecom.entity.Product_entity;
import edu.icet.ecom.model.Product;
import edu.icet.ecom.repository.Product_repository;
import edu.icet.ecom.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.print.attribute.standard.PrinterURI;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService_impl implements ProductService {

    final Product_repository repository;
    final ModelMapper mapper;

    @Override
    public List<Product> getAll() {
        List<Product_entity> product_entities = repository.findAll();
        List<Product> products = new ArrayList<>();
        product_entities.forEach(productEntity -> {
            products.add(mapper.map(productEntity,Product.class));
        });
        return products;
    }

    @Override
    public List<Product_entity> getShortByname(@RequestParam  String name) {
        return repository.findByNameContaining(name);
    }



}
