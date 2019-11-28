package com.ehc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ehc.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
