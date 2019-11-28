package com.ehc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ehc.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
