package edu.icet.ecom.repository;

import edu.icet.ecom.entity.Cart_entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface Cart_repository extends JpaRepository <Cart_entity,Integer> {

    List<Cart_entity> findByName(@Param("name") String name);

    @Modifying
    @Transactional
    @Query("UPDATE Cart_entity c SET c.qty = c.qty + :qty WHERE c.productID = :productID")
    void updateQuantity(@Param("productID") Integer productID, @Param("qty") Integer qty);


    @Query("SELECT c FROM Cart_entity c WHERE c.availabillity = 'not Placed'")
    List<Cart_entity> findAllNotPlacedCarts();



//    @Modifying
//    @Query("DELETE FROM Cart c WHERE c.availabillity = 'not Placed'")
//    void deleteNotPlacedOrders();


}

