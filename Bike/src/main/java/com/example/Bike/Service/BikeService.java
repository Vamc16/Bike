package com.example.Bike.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Bike.Model.Bikes;
import com.example.Bike.Repository.BikeRepository;


@Service
public class BikeService {
	@Autowired
	BikeRepository bikeRepository;
	

	public List<Bikes> getAllBikes() {
		List<Bikes> Bikes = bikeRepository.findAll();
		return Bikes;
	}
	
	public Bikes getBikeById(int id) {
		return bikeRepository.findById(id).get();
	}
	
	public void saveBikes(Bikes bikes) {
		bikeRepository.save(bikes);
	}
	
	public void updateBikes(Bikes bikes,int id) {
		bikeRepository.save(bikes);
		
	}
	
	public void deleteBikes(int id) {
		bikeRepository.deleteById(id);
	}

}
