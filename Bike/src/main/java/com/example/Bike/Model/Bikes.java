package com.example.Bike.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bikes {

	
	@Override
	public String toString() {
		return "Bikes [id=" + id + ", bikeBrand=" + bikeBrand + ", bikeModel=" + bikeModel + "]";
	}
	public Bikes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bikes(int id, String bikeBrand, String bikeModel) {
		super();
		this.id = id;
		this.bikeBrand = bikeBrand;
		this.bikeModel = bikeModel;
	}
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	private String bikeBrand;
	private String bikeModel;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBikeBrand() {
		return bikeBrand;
	}
	public void setBikeBrand(String bikeBrand) {
		this.bikeBrand = bikeBrand;
	}
	public String getBikeModel() {
		return bikeModel;
	}
	public void setBikeModel(String bikeModel) {
		this.bikeModel = bikeModel;
	}
}
