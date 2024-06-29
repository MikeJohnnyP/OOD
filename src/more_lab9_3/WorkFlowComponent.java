package more_lab9_3;

import java.util.Iterator;
import java.util.Stack;

public abstract class WorkFlowComponent implements Iterator {
    Stack stack = new Stack<>();

    @Override
    public boolean hasNext() {
        if (stack.isEmpty()) {
            return false;
        } else {
            Iterator iterator = (Iterator) stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public WorkFlowComponent next() {
        if (hasNext()) {
            Iterator<WorkFlowComponent> iterator = (Iterator) stack.peek();
            WorkFlowComponent component = (WorkFlowComponent) iterator.next();
            if (component instanceof TaskGroup) {
                stack.push(component.createIterator());
            }
            return component;
        } else {
            return null;
        }
    }

    public Iterator<WorkFlowComponent> createIterator() {
        return null;
    }

    public void add(WorkFlowComponent component) {
        stack.push(component);
    }

    public void remove(WorkFlowComponent component) {
        stack.remove(component);
    }

    public void display() {
        System.out.println("WorkFlowComponent");
    }

}
