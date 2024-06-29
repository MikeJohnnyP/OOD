package lab7.ex4;

import java.util.List;
import java.util.Map;

public interface AnotherDatabase {
	public void connect(Core database);

    public void insertData(Map<String, Table> data);

    public void updateData(Map<String, Table> data, String whereClause);

    public void deleteData(String tableName, String whereClause);

    public List<Map<String, Table>> query(String query);

    public String mapTableName();							

    public Map<String, Table> mapData(Map<String, Table> data);

    public String mapWhereClause(String whereClause);

    public String buildQuery(Map<String, Table> data, String whereClause);

    public void printDatabase();

    public void printDatabase(String tableName);
}
