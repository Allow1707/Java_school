package CollectionUtils;

import java.util.List;

import static CollectionUtils.CollectionUtils.*;

public class Main {
    public static void main(String[] args) {
        List<String> a = newArrayList();
        add(a, "asd");
        add(a, "bsd");
        add(a, "asd");
        System.out.println(a);
        List<String> b = newArrayList();
        add(b, "asd");
        add(b, "ds");
        System.out.println(containsAll(a,b));
    }
}
