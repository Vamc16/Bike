package com.example.Bike.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Bike.Model.Bikes;


@Repository
public interface BikeRepository extends JpaRepository<Bikes,Integer> {

}
