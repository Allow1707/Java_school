package CountMap;

import java.util.HashMap;
import java.util.Map;

public class CountMapClass<T> implements CountMapInterface<T> {
    private HashMap<T, Integer> values = new HashMap<>();
    private int size = 0;

    public HashMap<T, Integer> getValues() {
        return values;
    }

    public void setValues(HashMap<T, Integer> values) {
        this.values = values;
    }

    @Override
    public void add(T t) {
        if(!values.containsKey(t)){
            ++size;
            values.put(t,1);
        }else{
            Integer value = values.get(t);
            value++;
            values.put(t,value);
        }
    }

    @Override
    public int getCount(T t) {
        return values.getOrDefault(t, 0);
    }

    @Override
    public int remove(T t) {
        if(!values.containsKey(t)){
            return 0;
        }else{
            int count = values.get(t);
            values.remove(t);
            return count;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void addAll(CountMapInterface<T> source) {
        HashMap<T, Integer> values = source.getValues();
        for (Map.Entry<T, Integer> pair : values.entrySet()) {
            if (this.getValues().containsKey(pair.getKey())) {
                int i = this.getValues().get(pair.getKey()) + pair.getValue();
                this.getValues().put(pair.getKey(), i);
            } else {
                this.getValues().put(pair.getKey(), pair.getValue());
            }
        }
    }

    @Override
    public Map<T, Integer> toMap() {
        Map<T, Integer> m = new HashMap<>();
        for (Map.Entry<T, Integer> entry : this.getValues().entrySet()) {
            T key = entry.getKey();
            Integer value = entry.getValue();
            m.put(key, value);
        }
        return m;
    }

    @Override
    public void toMap(Map<T, Integer> destination) {
        destination = toMap();
    }
}
