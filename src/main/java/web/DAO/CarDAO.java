package web.DAO;

import web.Model.Car;

import java.util.List;

public interface CarDAO {
    List<Car> getAllCars (int count);
}
