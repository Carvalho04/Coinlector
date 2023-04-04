package br.edu.unifacear.jdbc;

import java.sql.*;

public class Fabrica {

	public Connection getConnection() {
		try {
			return DriverManager.getConnection(
					"jdbc:mysql://localhost/Coinlector?autoReconnect=true&useSSL=false", "root", "admin");
		}catch(SQLException e) {
			throw new RuntimeException("Erro ao conectar ao BD\n" + e.getMessage());
		}
		
	}
}
