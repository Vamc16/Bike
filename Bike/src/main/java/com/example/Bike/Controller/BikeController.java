package com.example.Bike.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Bike.Model.Bikes;
import com.example.Bike.Service.BikeService;

@RestController
public class BikeController {
	@Autowired
	BikeService bikeService;
	
	@GetMapping("/Bikes")
	private List<Bikes> getAllBikes(){
		return bikeService.getAllBikes();
		
	}
	@PostMapping("/Bikes")
	private int saveBikes(@RequestBody Bikes bikes) {
		bikeService.saveBikes(bikes);
		return bikes.getId();
	}
	@DeleteMapping("/Bikes/{id}")
	private void deleteBikes(@PathVariable("id") int id) {
		bikeService.deleteBikes(id);
		
	}
	@PutMapping("/Bikes{id}")
	private Bikes update(@PathVariable("id") int id,Bikes bikes) {
		bikeService.updateBikes(bikes,id);
		return bikes;
		
	}
	
	
	
	

}
