package org.fokinms.journey.car_service.service;

import lombok.RequiredArgsConstructor;
import org.fokinms.journey.car_service.dto.OrderDto;
import org.fokinms.journey.car_service.exception.OrderNotFoundException;
import org.fokinms.journey.car_service.mapper.OrderMapper;
import org.fokinms.journey.car_service.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    public OrderDto findOrderById(Long orderId) {
        return orderMapper.toDto(orderRepository.findById(orderId)
                .orElseThrow(() -> new OrderNotFoundException(String.format("Order not found with id: %d", orderId))));
    }

    public List<OrderDto> findAllOrders() {
        return orderMapper.toDtos(orderRepository.findAll());
    }
}
