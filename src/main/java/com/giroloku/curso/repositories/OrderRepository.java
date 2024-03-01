package com.giroloku.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giroloku.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
