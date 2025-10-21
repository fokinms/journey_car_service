package org.fokinms.journey.car_service.mapper;

import org.fokinms.journey.car_service.dto.CarDto;
import org.fokinms.journey.car_service.entity.Car;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CarMapper {

    CarDto toDto(Car car);
    Car toEntity(CarDto CarDto);

    List<CarDto> toDtos(List<Car> cars);
}
