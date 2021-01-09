package CollectionUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CollectionUtils {
    public static<T> void addAll(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }

    public static <T> List<T> newArrayList() {
        return new ArrayList<>();
    }

    public static<T> int indexOf(List<? extends T> source, T o) {
        int i = 0;
        for(T t: source){
            if(t == o){
               return i;
            }
            ++i;
        }
        return -1;
    }

    //public static List limit(List source, int size) { };

    public static<T> void add(List<? super T> source, T o) {
        source.add(o);
    }

    public static<T> void removeAll(List<? extends T> removeFrom, List<? extends T> c2) {
        for(T t: c2){
            int index = indexOf(removeFrom, t);
            while(index != -1){
                removeFrom.remove(index);
                index = indexOf(removeFrom, t);
            }
        }
    }

    public static<T> boolean containsAll(List<? super T> c1, List<? extends T> c2) {
        for(T t: c2){
            if(indexOf(c1, t) == -1){
                return false;
            }
        }
        return true;
    }

    public static<T> boolean containsAny(List<? super T> c1, List<? extends T> c2) {
        for(T t: c2){
            if(indexOf(c1, t) != -1){
                return true;
            }
        }
        return false;
    }

   /* public static<T extends Number> List<T> range(List<? extends T> list, T min, T max) {
        List<T> list_range = new ArrayList<>();

        for(T l: list){
        }
    };*/

    public static <T> List<T> range(List<? extends T> list, T min, T max, Comparator<? super T> comparator) {
        List<T> list_range = new ArrayList<>();
        for(T t: list){
            if(comparator.compare(min, t) <= 0 && comparator.compare(t, max) <= 0){
                list_range.add(t);
            }
        }
        list_range.sort(comparator);
        return list_range;
    }
}
