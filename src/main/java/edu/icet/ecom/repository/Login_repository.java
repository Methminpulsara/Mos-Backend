package edu.icet.ecom.repository;

import edu.icet.ecom.entity.Login_entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface Login_repository extends JpaRepository <Login_entity,Integer> {

    Login_entity findByEmailAndPassword(@Param("email") String email,@Param("password") String password);
}
