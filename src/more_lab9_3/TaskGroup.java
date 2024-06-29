package more_lab9_3;

import java.util.Iterator;

public class TaskGroup extends WorkFlowComponent {

    @Override
    public Iterator<WorkFlowComponent> createIterator() {
        return stack.iterator();
    }

    @Override
    public void display() {
        if (hasNext()) {
            WorkFlowComponent component = (WorkFlowComponent) next();
            component.display();
        } else {
            System.out.println("TaskGroup");
        }

    }
}
