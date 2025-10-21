package org.fokinms.journey.car_service.dto;

import org.fokinms.journey.car_service.entity.CarClass;
import org.fokinms.journey.car_service.entity.CarStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record CarDto(Long id,
                     String carName,
                     String city,
                     CarClass carClass,
                     BigDecimal price,
                     CarStatus carStatus,
                     LocalDateTime createdAt,
                     LocalDateTime updatedAt) {
}