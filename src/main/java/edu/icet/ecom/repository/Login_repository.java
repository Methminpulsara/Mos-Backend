package edu.icet.ecom.repository;

import edu.icet.ecom.entity.Login_entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Login_repository extends JpaRepository <Login_entity,Integer> {

   Login_entity findByEmail(String email);
}
