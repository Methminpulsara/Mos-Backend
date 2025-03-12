package edu.icet.ecom.repository;

import edu.icet.ecom.entity.OrderDetail_entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetail_repository extends JpaRepository<OrderDetail_entity,Integer> {
}
