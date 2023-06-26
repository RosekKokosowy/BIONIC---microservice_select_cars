package com.example.bionicmicroservice_select_cars.repository;

import com.example.bionicmicroservice_select_cars.data.Combi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CombiRepository extends JpaRepository<Combi,Long> {
}
