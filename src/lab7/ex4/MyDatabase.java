package lab7.ex4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyDatabase implements Database {
    private Core databaseLink;

    public MyDatabase(Core database) {
        connect(database);
    }

    @Override
    public void connect(Core database) {
        this.databaseLink = database;
    }

    @Override
    public void insertData(Map<String, Table> data) {
        for (Map.Entry<String, Table> i : data.entrySet()) {
            if (databaseLink.hasKey(i.getKey())) {
                databaseLink.addValue(i.getKey(), i.getValue());
            }
        }
    }

    @Override
    public void updateData(Map<String, Table> data, String whereClause) {
        for (Map.Entry<String, Table> i : data.entrySet()) {
            if (databaseLink.hasKey(i.getKey())) {
                databaseLink.update(i.getKey(), whereClause, i.getValue());
            }
        }
    }

    @Override
    public void deleteData(String tableName, String whereClause) {
        databaseLink.delete(tableName, whereClause);
    }

    @Override
    public List<Map<String, Table>> query(String query) {
        List<Map<String, Table>> result = new ArrayList<>();
        for (Map.Entry<String, ArrayList<Table>> i : databaseLink.getMap().entrySet()) {
            String key = i.getKey();
            List<Table> temp = databaseLink.clauseList(key, query);
            for (Table t : temp) {
                result.add(Core.createEntry(key, t));

            }
        }
        return result;
    }

    @Override
    public String mapTableName() {
        return databaseLink.getAllKey();
    }

    @Override
    public Map<String, Table> mapData(Map<String, Table> data) {
        Map<String, Table> result = new HashMap<>();
        for (Map.Entry<String, Table> i : data.entrySet()) {
            String key = databaseLink.map(i.getKey());
            result.put(key, i.getValue());
        }
        return result;
    }

    @Override
    public String mapWhereClause(String whereClause) {
        String[] temp = databaseLink.concatString(whereClause);
        String result = temp[0].toUpperCase() + " = " + temp[1];
        return result;
    }

    @Override
    public String buildQuery(Map<String, Table> data, String whereClause) {
        Map<String, Table> temp = new HashMap<>();
        List<Table> tList = new ArrayList<>();
        String[] clause = databaseLink.concatString(whereClause);
        for (Map.Entry<String, Table> i : data.entrySet()) {
            i.getValue().query(clause, tList);
            temp.put(i.getKey(), tList.iterator().next());
            tList.clear();
        }
        return temp.toString();
    }

    @Override
    public void printDatabase() {
        databaseLink.printDatabase();
    }

    @Override
    public void printDatabase(String tableName) {
        databaseLink.printData(tableName);
    }

}
