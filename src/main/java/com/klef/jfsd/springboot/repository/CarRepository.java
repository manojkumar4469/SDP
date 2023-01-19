package com.klef.jfsd.springboot.repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.klef.jfsd.springboot.model.Car;
public interface CarRepository extends CrudRepository<Car, Integer>{
@Query("Select c from Car c where username=?1")
public Car viewcar(String car);

@Query("delete from Car c where username=?1")
public Car deleteCarById(String uname);
}
