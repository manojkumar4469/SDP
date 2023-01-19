package com.klef.jfsd.springboot.model;
import java.awt.Image;

import javax.persistence.*;
@Entity
@Table(name="car_table")
public class Car {
@Id
@GeneratedValue
private int id;

@Column(nullable=false,length=200)
private String carname;
@Column(nullable=false,length=200)
private String model;
@Column(nullable=false,length=200)
private int milage;
@Column(nullable=false,length=200)
private double price;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCarname() {
	return carname;
}
public void setCarname(String carname) {
	this.carname = carname;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getMilage() {
	return milage;
}
public void setMilage(int milage) {
	this.milage = milage;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Car [id=" + id + ", carname=" + carname + ", model=" + model + ", milage=" + milage + ", price=" + price
			+ "]";
}
}
