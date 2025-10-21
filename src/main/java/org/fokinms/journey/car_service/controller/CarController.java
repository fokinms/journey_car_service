package org.fokinms.journey.car_service.controller;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.fokinms.journey.car_service.dto.CarDto;
import org.fokinms.journey.car_service.service.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/car")
@RequiredArgsConstructor
public class CarController {

    private final CarService carService;

    @GetMapping("/{carId}")
    public CarDto findCarById(@NonNull @PathVariable Long carId) {
        return carService.findCarById(carId);
    }

    @GetMapping("/cars")
    public List<CarDto> findAllCars() {
        return carService.findAllCars();
    }
}