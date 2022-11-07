package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.dao.CarDAOImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private CarDAO carDAO;

    public CarServiceImpl(CarDAO carDAO) {

        List<Car> cars = new ArrayList<>();

        cars.add(new Car(1, "Audi", 4));
        cars.add(new Car(2, "BMW", 3));
        cars.add(new Car(3, "Mercedes", 1));
        cars.add(new Car(4, "Tesla", 3));
        cars.add(new Car(5, "Mazda", 7));

        this.carDAO = new CarDAOImpl(cars);
    }

    @Override
    public List<Car> getSomeCars(int count) {
        return this.carDAO.getSomeCars(count);
    }
}
