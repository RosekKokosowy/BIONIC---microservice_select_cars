package com.example.bionicmicroservice_select_cars.service;

import com.example.bionicmicroservice_select_cars.data.*;
import com.example.bionicmicroservice_select_cars.repository.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CombiService {

    private final CombiRepository combiRepository;

    public CombiService(CombiRepository combiRepository) {
        this.combiRepository = combiRepository;
    }

    public List<Combi> getAll(){return combiRepository.findAll();}
}
