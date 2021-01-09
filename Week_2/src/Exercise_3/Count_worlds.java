package Exercise_3;


import java.util.HashMap;
import java.util.Map;

public class Count_worlds {
        public static Map<String, Integer> count_worlds(String str){
            Map<String, Integer> map = new HashMap<>();
            String[] list_worlds = str.split("\\s");
            for(String s: list_worlds){
                if(!map.containsKey(s)){
                    map.put(s,1);
                }else{
                    Integer integer = map.get(s);
                    ++integer;
                    map.put(s,integer);
                }
            }
            return map;
        }
}
