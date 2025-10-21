package org.fokinms.journey.car_service.service;

import lombok.RequiredArgsConstructor;
import org.fokinms.journey.car_service.dto.CarDto;
import org.fokinms.journey.car_service.exception.CarNotFoundException;
import org.fokinms.journey.car_service.mapper.CarMapper;
import org.fokinms.journey.car_service.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;
    private final CarMapper carMapper;

    public CarDto findCarById(Long carId) {
        return carMapper.toDto(carRepository.findById(carId)
                .orElseThrow(() -> new CarNotFoundException(String.format("Car not found with id: %d", carId))));
    }

    public List<CarDto> findAllCars() {
        return carMapper.toDtos(carRepository.findAll());
    }
}