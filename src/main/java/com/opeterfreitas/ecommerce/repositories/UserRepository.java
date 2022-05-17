package com.opeterfreitas.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.opeterfreitas.ecommerce.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
