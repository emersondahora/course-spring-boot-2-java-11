package com.emersondahora.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emersondahora.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
