import Car.*;
import Exercise_1.Counter;
import Exercise_2.Sort_str;
import Exercise_3.Count_worlds;
import Exercise_4.Reverse;
import Exercise_5.List_iterator;
import Exercise_6.Print_line;

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
        String str = "go z zz a win hell big-data a zz jall";
        String text = "В частности социально-экономическое развитие создаёт предпосылки для дальнейших направлений развития\n" +
                "Существующая теория предопределяет высокую востребованность прогресса профессионального сообщества\n" +
                "Сложно сказать почему базовые сценарии поведения пользователей которые представляют собой яркий\n" +
                "пример континентально-европейского типа политической культуры будут объявлены нарушающими общечеловеческие\n" +
                "нормы этики и морали";

        System.out.println(Counter.count(str));
        System.out.println("Количество различных слов: " + Counter.count(str).size());

        //Exercise_2
        System.out.println("------------------------------------");
        System.out.println("Список слов отсортированный по убыванию кол-ва букв: " + Sort_str.sort_string(Counter.count(str)));

        //Exercise_3
        System.out.println("------------------------------------");
        System.out.println("Кол-во вхождений каждого слова: " + Count_worlds.count_worlds(str));

        //Exercise_4
        System.out.println("------------------------------------");
        Reverse.reverse(text);

        //Exercise_5
        System.out.println("------------------------------------");
        String[] list = {"avc","hold", "fad", "weer","hold"};
        System.out.println(Arrays.toString(list));
        List_iterator l = new List_iterator(list);
        for (Object o : l) {
            System.out.println(o);
        }

        //Exercise_6
        System.out.println("------------------------------------");
        String[] lines = text.split("\n");
        Print_line.print(1,lines);
        Print_line.print(3,lines);
    }
}
