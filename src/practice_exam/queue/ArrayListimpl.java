package practice_exam.queue;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListimpl<T> implements IArrayList {
    ArrayList<T> arr = new ArrayList<T>();

    public ArrayListimpl() {
    }

    @Override
    public void add(Object o) {
        arr.add((T) o);
    }

    @Override
    public Object get(int index) {
        return arr.get(index);
    }

    @Override
    public boolean isContain(Object o) {
        return arr.contains((T) o);
    }

    @Override
    public boolean isEmpty() {
        return arr.isEmpty();
    }

    @Override
    public int size() {
        return arr.size();
    }

    @Override
    public String toString() {
        StringBuilder bd = new StringBuilder();
        for (T temp : arr) {
            bd.append((T) temp);
        }
        return bd.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return arr.iterator();
    }

}
