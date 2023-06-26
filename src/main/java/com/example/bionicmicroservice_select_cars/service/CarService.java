package com.example.bionicmicroservice_select_cars.service;

import com.example.bionicmicroservice_select_cars.data.*;
import com.example.bionicmicroservice_select_cars.dtos.QuizDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class CarService {
    private final CabrioService cabrioService;
    private final CombiService combiService;
    private final CoupeService coupeService;
    private final SedanService sedanService;
    private final SmallCarsService smallCarsService;
    private final suvService suvvService;

    public CarService(CabrioService cabrioService, CombiService combiService, CoupeService coupeService, SedanService sedanService, SmallCarsService smallCarsService, suvService suvvService) {
        this.cabrioService = cabrioService;
        this.combiService = combiService;
        this.coupeService = coupeService;
        this.sedanService = sedanService;
        this.smallCarsService = smallCarsService;
        this.suvvService = suvvService;
    }

    public QuizDto get40RandomCars(){
        List<Cabrio> cabrios = cabrioService.getAll();
        List<Combi> combis = combiService.getAll();
        List<Coupe> coupes = coupeService.getAll();
        List<Sedan> sedans = sedanService.getAll();
        List<smallCars> smallCarsList = smallCarsService.getAllSmallCars();
        List<Suvs> suvsList = suvvService.getAllSuvs();

        List<Object> allCars = new ArrayList<>();

        allCars.addAll(cabrios);
        allCars.addAll(combis);
        allCars.addAll(coupes);
        allCars.addAll(sedans);
        allCars.addAll(smallCarsList);
        allCars.addAll(suvsList);

        ArrayList<Object> randCars = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 40 ; i++) {
            int randomIndex = rand.nextInt(allCars.size());
            randCars.add(allCars.get(randomIndex));
        }

        QuizDto quizDto = new QuizDto();
        quizDto.setCars(randCars);
        quizDto.setChoices(new ArrayList<>());
        quizDto.setShowed(0);

        return quizDto;
    }
}
