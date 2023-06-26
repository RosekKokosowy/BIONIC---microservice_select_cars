package com.example.bionicmicroservice_select_cars.repository;


import com.example.bionicmicroservice_select_cars.data.smallCars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface smallCarsRepository extends JpaRepository<smallCars,Long> {
}
