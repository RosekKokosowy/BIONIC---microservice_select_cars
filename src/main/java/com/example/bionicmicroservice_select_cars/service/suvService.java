package com.example.bionicmicroservice_select_cars.service;

import com.example.bionicmicroservice_select_cars.data.*;
import com.example.bionicmicroservice_select_cars.repository.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class suvService {
    private final SuvRepository suvRepository;

    public suvService(SuvRepository suvRepository) {
        this.suvRepository = suvRepository;
    }

    public List<Suvs> getAllSuvs(){return suvRepository.findAll();}
}
