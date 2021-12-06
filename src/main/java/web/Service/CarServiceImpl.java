package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.DAO.CarDAO;
import web.Model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDAO carDAO;


    @Override
    public List<Car> getAllCars(int count) {
        return carDAO.getAllCars(count);
    }
}
