package Exercise_5;

import java.util.AbstractCollection;
import java.util.Iterator;

public class List_iterator extends AbstractCollection {
    private final String[] list;

    public List_iterator(String[] list) {
        this.list = list;
    }

    public String[] getList() {
        return list;
    }


    @Override
    public Iterator iterator() {
        return new Iterator() {
            int i = list.length;

            @Override
            public boolean hasNext() {
                return i != 0;
            }

            @Override
            public Object next() {
                return list[--i];
            }
        };
    }

    @Override
    public int size() {
        return list.length;
    }
}
