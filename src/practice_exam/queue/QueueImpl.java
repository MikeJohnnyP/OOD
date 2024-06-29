package practice_exam.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueImpl<T> implements IQueue {
    Queue<T> queue = new LinkedList<T>();

    public QueueImpl() {
    }

    @Override
    public void put(Object o) {
        queue.add((T) o);
    }

    @Override
    public Object poll(Object o) {
        return queue.poll();
    }

    @Override
    public Object get(Object o) {
        T result = null;
        if (queue.contains((T) o)) {
            for (T temp : queue) {
                if (temp.equals((T) o)) {
                    result = temp;
                }
            }
        }
        return result;
    }

    @Override
    public boolean isContain(Object o) {
        return queue.contains((T) o);
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public Iterator<T> iterator() {
        return queue.iterator();
    }

    @Override
    public String toString() {
        StringBuilder bd = new StringBuilder();
        for (T temp : queue) {
            bd.append((T) temp);
        }
        return bd.toString();
    }

    public static void main(String[] args) {
        IQueue queue = new QueueImpl<String>();
        queue.put("Hom nay an gi");
        queue.put("Ten em la gi");
        queue.put("Song tho the");
        System.out.println(queue.toString());

    }

}
