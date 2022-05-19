package com.opeterfreitas.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.opeterfreitas.ecommerce.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
