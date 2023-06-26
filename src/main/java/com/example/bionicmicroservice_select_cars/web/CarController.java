package com.example.bionicmicroservice_select_cars.web;

import com.example.bionicmicroservice_select_cars.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quiz")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/selection")
    public ResponseEntity<Object> getRandomCars(){
        return ResponseEntity.ok(carService.get40RandomCars());
    }
}
