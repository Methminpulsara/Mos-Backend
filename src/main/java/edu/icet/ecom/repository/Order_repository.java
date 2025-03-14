package edu.icet.ecom.repository;

import edu.icet.ecom.entity.Order_entity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Order_repository extends JpaRepository<Order_entity,Integer> {
    List<Order_entity> findAllById(Integer id);
}
