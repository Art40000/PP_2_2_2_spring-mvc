package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.*;

@Component
public class CarDAOImpl implements CarDAO {
    private List<Car> cars;

    public CarDAOImpl(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getSomeCars(int count) {
        List<Car> car = new ArrayList<>();
        if( count > 0 & count <= cars.size()) {
            for (int i = 0; i < count; i++) {
                car.add(cars.get(i));
            }
            return car;
        } else {
            return cars;
        }
    }

}
