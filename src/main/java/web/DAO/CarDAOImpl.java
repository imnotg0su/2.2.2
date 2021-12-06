package web.DAO;

import org.springframework.stereotype.Component;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAOImpl implements CarDAO{

    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("AUDI", "red", 2007));
        cars.add(new Car("KIA", "black", 2015));
        cars.add(new Car("BMW", "white", 2020));
        cars.add(new Car("Mazda", "sky blue", 2011));
        cars.add(new Car("Honda", "yellow", 2009));
    }

    @Override
    public List<Car> getAllCars(int count) {
        if (count > 5) {
            return cars.subList(0, cars.size());
        } else {
            return cars.subList(0, count);
        }
    }
}
