package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao {

    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Lada", "2112", "black"));
        cars.add(new Car("Mercedes", "C200", "white"));
        cars.add(new Car("Mitsibishi", "Lancer", "red"));
        cars.add(new Car("Opel", "Vectra", "blue"));
        cars.add(new Car("BMW", "m5", "black"));
    }

    public CarDaoImp() {
    }

    @Override
    public List<Car> showCountCars(int count) {
        if (count >= 5) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
