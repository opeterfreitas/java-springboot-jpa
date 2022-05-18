package com.opeterfreitas.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.opeterfreitas.ecommerce.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
