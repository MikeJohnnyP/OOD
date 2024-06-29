package practice_exam.queue;

import java.util.Iterator;

public interface IArrayList {
    public void add(Object o);

    public Object get(int index);

    public boolean isContain(Object o);

    public boolean isEmpty();

    public int size();

    public String toString();

    public Iterator iterator();
}
