package edu.icet.ecom.repository;

import edu.icet.ecom.entity.Cart_entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface Cart_repository extends JpaRepository <Cart_entity,Integer> {

    List<Cart_entity> findByName(@Param("name") String name);

    @Modifying
    @Transactional
    @Query("UPDATE Cart_entity c SET c.qty = c.qty + :qty WHERE c.productID = :productID")
    void updateQuantity(@Param("productID") Integer productID, @Param("qty") Integer qty);

    @Modifying
    @Transactional
    void deleteByproductID(Integer productID );




}

