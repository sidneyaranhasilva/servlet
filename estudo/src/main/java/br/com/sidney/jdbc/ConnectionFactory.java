package br.com.sidney.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	
	
	/*
	 * Forma de pegar conexão
	 * Connection con = new ConnectionFactory().getConnection();
	 */
	public Connection getConnection() {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver()); //Essa linha foi a diferença
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/estudo", "root", "");
			System.out.println("Conectado...!");
			return connection;
		} catch (SQLException e) {
			throw new RuntimeException();
		}

	}
}
