package com.example.bionicmicroservice_select_cars.service;


import com.example.bionicmicroservice_select_cars.data.Cabrio;
import com.example.bionicmicroservice_select_cars.repository.CabrioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CabrioService {

    private final CabrioRepository cabrioRepository;

    public CabrioService(CabrioRepository cabrioRepository) {
        this.cabrioRepository = cabrioRepository;
    }

    public List<Cabrio> getAll(){return cabrioRepository.findAll();}
}
