package com.klef.jfsd.springboot.service;

import com.klef.jfsd.springboot.model.Car;

public interface CarService {
	public Car addcar(Car car);
	public Car viewcar(String cname);
	public Car deleteCarById(String cname);

}
