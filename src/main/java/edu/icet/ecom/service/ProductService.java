package edu.icet.ecom.service;

import edu.icet.ecom.entity.Product_entity;
import edu.icet.ecom.model.Product;
import java.util.List;

public interface ProductService {
    List<Product>getAll ();
    List<Product_entity>getShortByname(String name);
}
