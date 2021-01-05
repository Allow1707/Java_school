package Car;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;


//Класс содержащий метод для распределения входного списка машин
public class CarDistribution {
    public static HashMap<String, ArrayList<String>> distribution(Collection<Car> cars){
        Iterator<Car> iterator = cars.iterator();
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        while (iterator.hasNext()){
            Car b = iterator.next();
            ArrayList<String> value = new ArrayList<>();
            if (map.containsKey(b.getType())) value = map.get(b.getType());
            value.add(b.getModel());
            map.put(b.getType(), value);
        }
        return map;
    }
}
