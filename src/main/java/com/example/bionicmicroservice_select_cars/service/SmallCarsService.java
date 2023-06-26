package com.example.bionicmicroservice_select_cars.service;

import com.example.bionicmicroservice_select_cars.data.*;
import com.example.bionicmicroservice_select_cars.repository.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SmallCarsService {
    private final smallCarsRepository smallCRepository;

    public SmallCarsService(smallCarsRepository smallCRepository) {
        this.smallCRepository = smallCRepository;
    }

    public List<smallCars> getAllSmallCars(){return smallCRepository.findAll();}
}
