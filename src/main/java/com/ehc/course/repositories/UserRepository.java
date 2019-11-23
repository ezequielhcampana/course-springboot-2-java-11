package com.ehc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ehc.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
