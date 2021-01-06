package Exercise_1;

import java.util.Arrays;
import java.util.HashSet;


//Подсчет кол-во слов
public class Counter {
    public static HashSet<String> count(String str){
        String[] list_world = str.split("\\s");
        return new HashSet<>(Arrays.asList(list_world));
    }
}
