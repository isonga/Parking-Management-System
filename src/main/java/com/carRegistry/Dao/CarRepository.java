package com.carRegistry.Dao;

import java.util.List;

import com.carRegistry.model.Car;

public interface CarRepository {

	public int save(Car car);
	
	public Car get(String plateNo);
	
	public int delete(String plateNo);
	
	public int update(Car car);
	
	public List<Car> list();
}
