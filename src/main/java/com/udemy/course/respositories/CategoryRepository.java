package com.udemy.course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.course.entities.Category;
import com.udemy.course.entities.Order;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
