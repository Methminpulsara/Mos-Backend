package edu.icet.ecom.repository;
import edu.icet.ecom.entity.Product_entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Product_repository extends JpaRepository<Product_entity, Integer> {

    @Query("SELECT p FROM Product_entity p WHERE p.name LIKE %:name%")
    List<Product_entity> findByNameContaining(@Param("name") String name);
}
