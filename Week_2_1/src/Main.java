import Car.*;
import Exercise_1.Counter;
import Exercise_2.Sort_str;

import java.util.*;
public class Main {
    public static void main(String[] args) {

        //Car
        List<Car> cars = new ArrayList<>();
        CarLoad.init(cars);
        CarLoad.print(cars);
        HashMap<String, ArrayList<String>> b = CarDistribution.distribution(cars);
        System.out.println(b);

        //Exercise_1
        String str = "win go hell z a aa hell";
        System.out.println("Количество различных слов: " + Counter.count(str).size());

        //Exercise_2
        System.out.println(Sort_str.sort_string(Counter.count(str)));

    }
}
