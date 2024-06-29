package practice_exam.queue;

import java.util.Iterator;

public interface IQueue {
    public void put(Object o);

    public Object poll(Object o);

    public Object get(Object o);

    public boolean isContain(Object o);

    public int size();

    public String toString();

    public Iterator iterator();
}
