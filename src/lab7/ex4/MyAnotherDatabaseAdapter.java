package lab7.ex4;

import java.util.List;
import java.util.Map;

public class MyAnotherDatabaseAdapter implements AnotherDatabase {
	Database databaseAdapter;

	public MyAnotherDatabaseAdapter(Database databaseAdapter) {
		this.databaseAdapter = databaseAdapter;
	}

	@Override
	public void connect(Core database) {
		databaseAdapter.connect(database);
	}

	@Override
	public void insertData(Map<String, Table> data) {
		databaseAdapter.insertData(data);
	}

	@Override
	public void updateData(Map<String, Table> data, String whereClause) {
		databaseAdapter.updateData(data, whereClause);
	}

	@Override
	public void deleteData(String tableName, String whereClause) {
		databaseAdapter.deleteData(tableName, whereClause);
	}

	@Override
	public List<Map<String, Table>> query(String query) {
		return databaseAdapter.query(query);
	}

	@Override
	public String mapTableName() {
		return databaseAdapter.mapTableName();
	}

	@Override
	public Map<String, Table> mapData(Map<String, Table> data) {
		return databaseAdapter.mapData(data);
	}

	@Override
	public String mapWhereClause(String whereClause) {
		return mapWhereClause(whereClause);
	}

	@Override
	public String buildQuery(Map<String, Table> data, String whereClause) {
		return databaseAdapter.buildQuery(data, whereClause);
	}

	@Override
	public void printDatabase() {
		databaseAdapter.printDatabase();
	}

	@Override
	public void printDatabase(String tableName) {
		databaseAdapter.printDatabase(tableName);
	}

}
