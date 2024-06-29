package practice_exam.queue;

import java.util.Iterator;

public class ArrayListAdapter<T> implements IArrayList {
    IArrayList arr;

    public ArrayListAdapter(IQueue queue) {
        arr = new ArrayListimpl<T>();
        convert(queue);
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
        return arr.isContain((T) o);
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
    public Iterator<T> iterator() {
        return arr.iterator();
    }

    @Override
    public String toString() {
        return arr.toString();
    }

    public void convert(IQueue queue) {
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            arr.add((T) it.next());
        }
    }

}
