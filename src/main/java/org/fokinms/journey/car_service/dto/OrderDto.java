package org.fokinms.journey.car_service.dto;

import org.fokinms.journey.car_service.entity.OrderStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record OrderDto(Long id,
                       Long userId,
                       Long carId,
                       OrderStatus orderStatus,
                       BigDecimal orderPrice,
                       LocalDateTime orderStartDate,
                       LocalDateTime orderEndDate,
                       LocalDateTime createdAt,
                       LocalDateTime updatedAt) {
}
