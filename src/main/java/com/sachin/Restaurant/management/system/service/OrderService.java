package com.sachin.Restaurant.management.system.service;

import com.sachin.Restaurant.management.system.exception.NotFoundException;
import com.sachin.Restaurant.management.system.model.Order;
import com.sachin.Restaurant.management.system.repository.IOrderRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderService {
    private final IOrderRepo orderRepo;

    public OrderService(IOrderRepo orderRepository) {
        this.orderRepo = orderRepository;
    }

    public Order createOrder(Order order) {
        order.setDateTime(LocalDateTime.now());
        return orderRepo.save(order);
    }

    public Order getOrderById(Long id) {
        return orderRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Order not found"));
    }

    public List<Order> getAllOrders() {
        return orderRepo.findAll();
    }

    public void deleteOrder(Long id) {
        orderRepo.deleteById(id);
    }
}
