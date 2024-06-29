package lab7.ex4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class Core {
    protected Map<String, ArrayList<Table>> coreDatabase;

    public Core() {
        coreDatabase = new LinkedHashMap<>();
    }

    public Map<String, ArrayList<Table>> getMap() {
        return coreDatabase;
    }

    public void init() {
    }

    public boolean hasKey(String key) {
        return coreDatabase.containsKey(key);
    }

    public void addValue(String key, Table value) {
        if (coreDatabase.containsKey(key)) {
            coreDatabase.get(key).add(value);
        } else {
            coreDatabase.put(key, new ArrayList<Table>());
            coreDatabase.get(key).add(value);
        }
    }

    public void addKey(String key) {
        if (!coreDatabase.containsKey(key)) {
            coreDatabase.put(key, new ArrayList<Table>());
        }
    }

    protected abstract boolean instanceOf(Object obj);

    public ArrayList<Table> getValue(String key) {
        if (coreDatabase.containsKey(key)) {
            return coreDatabase.get(key);
        }
        return null;
    }

    public static Map<String, Table> createEntry(String tableName, Table value) {
        return Collections.singletonMap(tableName, value);
    }

    public void printDatabase() {
        coreDatabase.forEach((k, v) -> System.out.println(k + " : " + v));
    }

    public String[] concatString(String text) {
        String[] result = { "", "" };
        int i = 0;
        for (; i < text.length(); i++) {
            if (!(text.charAt(i) == '=')) {
                result[0] += text.charAt(i);
            } else
                break;
        }

        result[1] = text.substring(i + 1, text.length());
        result[0] = result[0].replaceAll(" ", "").toLowerCase();
        result[1] = result[1].replaceAll(" ", "").toLowerCase();
        return result;
    }

    public void update(String tableName, String whereClause, Table table) {
        String[] clause = concatString(whereClause);
        for (Table t : coreDatabase.get(tableName)) {
            t.update(clause, table);

        }
    }

    public List<Table> clauseList(String tableName, String query) {
        String[] clause = concatString(query);
        List<Table> temp = new ArrayList<>();
        for (Table t : coreDatabase.get(tableName)) {
            t.query(clause, temp);
        }
        return temp;
    }

    public void delete(String tableName, String whereClause) {
        coreDatabase.get(tableName).removeAll(clauseList(tableName, whereClause));
    }

    public String getAllKey() {
        return coreDatabase.keySet().toString();
    }

    public String map(String clause) {
        String temp = switch (clause.replaceAll(" ", "").toLowerCase()) {
            case "banhang" -> "BANHANG";
            case "nhanvien" -> "NHANVIEN";
            default -> clause;
        };
        return temp;

    }

    public void printData(String tableName) {
        for (Table t : coreDatabase.get(tableName)) {
            System.out.println(t.toString());
        }
    }

}
