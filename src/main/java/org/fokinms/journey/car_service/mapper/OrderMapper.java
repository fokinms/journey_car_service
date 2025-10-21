package org.fokinms.journey.car_service.mapper;

import org.fokinms.journey.car_service.dto.OrderDto;
import org.fokinms.journey.car_service.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface OrderMapper {

    OrderDto toDto(Order order);
    Order toEntity(OrderDto orderDto);

    List<OrderDto> toDtos(List<Order> orders);
}
