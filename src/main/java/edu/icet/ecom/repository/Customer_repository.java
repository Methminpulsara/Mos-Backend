package edu.icet.ecom.repository;

import edu.icet.ecom.entity.Customer_entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface Customer_repository extends JpaRepository<Customer_entity, Integer> {

    Optional<Customer_entity> findByNumber(@Param("phonenumber") String phonenumber);


}
