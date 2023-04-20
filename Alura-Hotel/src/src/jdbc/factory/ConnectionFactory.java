package src.jdbc.factory;

import java.sql.*;
import javax.sql.*;
import com.mchange.v2.c3p0.*;

public class ConnectionFactory {
	
	public DataSource dataSource;
	
	public ConnectionFactory() {
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost/dbhotelalura?serverTimezone=America/Argentina/Buenos_Aires");
		comboPooledDataSource.setUser("root");
		comboPooledDataSource.setPassword("admin");
		comboPooledDataSource.setMaxPoolSize(10);
		
		this.dataSource = comboPooledDataSource;
	}
	public Connection conectar() {
		try {
			return this.dataSource.getConnection();
		}catch (SQLException e) {
			e.getMessage();
			throw new RuntimeException(e);
		}
	}
		
}
