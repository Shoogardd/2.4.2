package web.DAO;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.*;
import java.util.stream.Collectors;

@Repository
public class CarDAOimpl implements CarDAO {

    private static final List<Car> cars = new ArrayList<>();


    static {
        cars.add(new Car("Mazda","Japan", 2008));
        cars.add(new Car("BMW","Germany", 2020));
        cars.add(new Car("Opel=(","England", 2014));
        cars.add(new Car("KIA","Korea", 2021));
        cars.add(new Car("KiA","Korea", 2021));
    }

    public List<Car> getCars() {
            return cars;
        }

    public List<Car> getCarsCount(int count) {

        return cars.stream().limit(count).collect(Collectors.toList());
    }

}
