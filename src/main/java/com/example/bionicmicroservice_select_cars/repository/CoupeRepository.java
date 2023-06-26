package com.example.bionicmicroservice_select_cars.repository;

import com.example.bionicmicroservice_select_cars.data.Coupe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoupeRepository extends JpaRepository<Coupe,Long> {
}
