package org.fokinms.journey.car_service.controller;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.fokinms.journey.car_service.dto.OrderDto;
import org.fokinms.journey.car_service.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @GetMapping("/{orderId}")
    public OrderDto findOrderById(@NonNull @PathVariable Long orderId) {
        return orderService.findOrderById(orderId);
    }

    @GetMapping("/orders")
    public List<OrderDto> findAllOrders() {
        return orderService.findAllOrders();
    }
}