package web.dao;

import web.model.Car;

import java.util.List;


public interface CarDaoInterface {
    List<Car> getCar(int count);
}
