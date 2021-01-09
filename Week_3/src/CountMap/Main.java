package CountMap;

public class Main {
    public static void main(String[] args){

        //Integer
        CountMapInterface<Integer> map = new CountMapClass<>();
        CountMapInterface<Integer> map1 = new CountMapClass<>();


        map.add(10);
        map.add(10);
        map.add(5);
        map.add(6);
        map.add(5);
        map.add(10);
        System.out.println(map.size());
        int count = map.getCount(10);
        System.out.println(count);
        count = map.getCount(1);
        System.out.println(count);

        map.remove(10);
        count = map.getCount(10);
        System.out.println(count);
        System.out.println(map.getValues());

        map1.addAll(map);
        System.out.println(map1.getValues());

        //String
        CountMapInterface<String> s = new CountMapClass<>();
        s.add("do");
        s.add("put");
        s.add("do");
        System.out.println(s.getValues());
        System.out.println(s.getCount("do"));
    }
}

