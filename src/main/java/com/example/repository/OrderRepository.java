package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.model.Order;
import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Long> {
    Optional<Order> findByOrderNumber(String orderNumber);
}
