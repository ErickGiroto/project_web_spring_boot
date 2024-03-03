package com.giroloku.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giroloku.curso.entities.OrderItem;
import com.giroloku.curso.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
