package com.klef.jfsd.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Car;
import com.klef.jfsd.springboot.repository.CarRepository;

@Service
public class CarServiceImpl implements CarService{
	@Autowired
	private CarRepository carRepository;

	@Override
	public Car viewcar(String cname) {
		// TODO Auto-generated method stub
		return carRepository.viewcar(cname);
	}

	@Override
	public Car deleteCarById(String cname) {
		// TODO Auto-generated method stub
		return carRepository.deleteCarById(cname);
	}
	@Override
	public Car addcar(Car car) {
		// TODO Auto-generated method stub
		return carRepository.save(car);
	}

}
