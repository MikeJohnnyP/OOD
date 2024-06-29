package lab7.ex4;

import java.util.List;

public interface Table {

    public void update(String[] text, Table table);

    public void query(String[] text, List<Table> list);

}
