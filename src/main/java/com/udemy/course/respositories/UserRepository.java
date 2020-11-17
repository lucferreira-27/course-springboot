package com.udemy.course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
