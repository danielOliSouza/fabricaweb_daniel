package br.com.daniel_pc.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
	private String JDBC_DRIVE = "org.postgresql.Driver";
	private String DATABASE_URL = "jdbc:postgresql://localhost:5432/";
	private String DATABASE_NAME = "fabricaweb";
	private static Connection conexao = null;
	
	public Connection getConexao() {
		return conexao;
	}

	public void setConexao(Connection new_conexao) {
		conexao = new_conexao;
	}
	
	public Connection conectar() throws Exception {
		String loginBD = "postgres";
		String passwdBD = "postgres";
		try {
			Class.forName(JDBC_DRIVE);
			conexao = DriverManager.getConnection(DATABASE_URL + DATABASE_NAME, loginBD, passwdBD);
		} catch (ClassNotFoundException | SQLException e) {
			throw new Exception ("Erro ao abrir uma conexão com o banco: " + e.getMessage());
		}
		
		return conexao;
	}
	
	
}
