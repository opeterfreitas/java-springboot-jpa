package com.opeterfreitas.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.opeterfreitas.ecommerce.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
