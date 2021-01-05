package Car;

import java.util.Collection;


//Класс для создания и печати списка машин
public class CarLoad {
    public static void init(Collection<Car> cars){
        cars.add(new Car("Лада", "Седан"));
        cars.add(new Car("BMW", "Седан"));
        cars.add(new Car("Mercedes", "Седан"));
        cars.add(new Car("Mercedes", "Хэтчбек"));
        cars.add(new Car("Жигули", "Хэтчбек"));
        cars.add(new Car("Toyota", "Внедорожник"));
    }

    public static void print(Collection<Car> cars){

        for (Car car : cars) {
            System.out.println(car.toString());
        }
    }
}
