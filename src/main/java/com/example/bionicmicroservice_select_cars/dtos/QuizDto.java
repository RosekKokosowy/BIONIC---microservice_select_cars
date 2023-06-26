package com.example.bionicmicroservice_select_cars.dtos;

import com.example.bionicmicroservice_select_cars.data.Car;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuizDto {
    private ArrayList<Object> cars;
    private ArrayList<Integer> choices;
    private int showed = 0;
    public static final int MAX_SIZE = 36;
}