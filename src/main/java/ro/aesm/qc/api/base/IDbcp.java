package ro.aesm.qc.api.base;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

public interface IDbcp {

	public Connection getConnection(String dbName) throws SQLException;

	public DataSource getDataSource(String name);

}