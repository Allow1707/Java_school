package Exercise_2;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Sort_str {

    public static TreeSet<String> sort_string(HashSet<String> set){
        Comparator<String> scomp = new StringComparatorLen().thenComparing(new StringComparator());
        TreeSet<String> sort_set = new TreeSet<>(scomp);
        sort_set.addAll(set);
        return sort_set;
    }

}
