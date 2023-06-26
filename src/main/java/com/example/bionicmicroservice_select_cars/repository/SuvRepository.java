package com.example.bionicmicroservice_select_cars.repository;


import com.example.bionicmicroservice_select_cars.data.Suvs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuvRepository extends JpaRepository<Suvs,Long> {
}
