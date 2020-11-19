package com.udemy.course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.course.entities.OrderItem;
import com.udemy.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
}
