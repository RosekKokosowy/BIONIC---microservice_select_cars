package com.example.bionicmicroservice_select_cars.service;

import com.example.bionicmicroservice_select_cars.data.*;
import com.example.bionicmicroservice_select_cars.repository.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SedanService {

    private final SedanRepository sedanRepository;

    public SedanService(SedanRepository sedanRepository) {
        this.sedanRepository = sedanRepository;
    }

    public List<Sedan> getAll(){return sedanRepository.findAll();}
}
