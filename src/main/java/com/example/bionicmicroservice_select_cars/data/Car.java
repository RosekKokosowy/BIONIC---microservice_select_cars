package com.example.bionicmicroservice_select_cars.data;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Car implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String img;

    @Column(name = "yearofmanufacture")
    private String yearOfManufacture;

    private String mileage;
    private String price;

    @Column(name = "horsepower")
    private String horsePower;

    @Column(name = "typeoffuel")
    private String typeOfFuel;

    @Column(name = "gearbox")
    private String gearBox;
}

