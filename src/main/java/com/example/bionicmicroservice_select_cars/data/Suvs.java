package com.example.bionicmicroservice_select_cars.data;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Suvs")
public class Suvs{

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
