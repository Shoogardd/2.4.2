package web.DAO;

import web.model.Car;

import java.util.List;

public interface CarDAO {
    List<Car> getCars();

    List<Car> getCarsCount(int count);

}
