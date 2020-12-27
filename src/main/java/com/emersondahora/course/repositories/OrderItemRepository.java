package com.emersondahora.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emersondahora.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
