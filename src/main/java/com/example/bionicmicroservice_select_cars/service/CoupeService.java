package com.example.bionicmicroservice_select_cars.service;

import com.example.bionicmicroservice_select_cars.data.*;
import com.example.bionicmicroservice_select_cars.repository.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoupeService {

    private final CoupeRepository coupeRepository;

    public CoupeService(CoupeRepository coupeRepository) {
        this.coupeRepository = coupeRepository;
    }

    public List<Coupe> getAll(){return coupeRepository.findAll();}
}
