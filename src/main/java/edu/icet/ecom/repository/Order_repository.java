package edu.icet.ecom.repository;

import edu.icet.ecom.entity.Order_entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Order_repository extends JpaRepository<Order_entity,Integer> {
}
