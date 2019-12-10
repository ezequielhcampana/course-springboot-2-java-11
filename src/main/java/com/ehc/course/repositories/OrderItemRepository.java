package com.ehc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ehc.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
