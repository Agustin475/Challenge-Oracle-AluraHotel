package src.jdbc.factory;

import java.sql.*;

public class TesteConexion {
	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost/dbhotelalura?serverTimezone=America/Argentina/Buenos_Aires",
				"root",
				"admin");
		System.out.println("Cerrando la conexion");
		
		con.close();
	}

}
