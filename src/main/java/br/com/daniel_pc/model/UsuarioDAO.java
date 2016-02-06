package br.com.daniel_pc.model;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO extends ConexaoFactory{

	public void insertUser(Usuario usuario) throws Exception {
		String sql = "INSERT INTO usuario(nome_user, login_user, passwd_user)"
					+ "VALUES (?, ?, ?)";
		PreparedStatement pst = null;
		
		try {
			pst = conectar().prepareStatement(sql);
			pst.setString(1, usuario.getNome_user());
			pst.setString(2, usuario.getLogin_user());
			pst.setString(3, usuario.getPasswd_user());
			pst.execute();
		} catch (SQLException e) {
			throw new Exception ("Erro ao inserir o usuario: " + e.getMessage());
		}finally{
			pst.close();
		}
		
	}

	public void updateUser(Usuario usuario) throws Exception {
		String sql = "UPDATE usuario SET nome_user = ?, login_user = ?, passwd_user = ?"
					+ "WHERE cod_user = ?";
		PreparedStatement pst = null;
		
		try {
			pst = conectar().prepareStatement(sql);
			pst.setString(1, usuario.getNome_user());
			pst.setString(2, usuario.getLogin_user());
			pst.setString(3, usuario.getPasswd_user());
			pst.setInt(4, usuario.getCod_user());
			pst.execute();
		} catch (SQLException e) {
			throw new Exception ("Erro ao alterar o usuario: " + e.getMessage());
		}finally{
			pst.close();
		}
	}
	
	public void deleteUser(Usuario usuario) throws Exception {
		String sql = "DELETE FROM usuario WHERE cod_user = ?";
		PreparedStatement pst = null;
		
		try {
			pst = conectar().prepareStatement(sql);
			pst.setInt(1, usuario.getCod_user());
			pst.execute();
		} catch (SQLException e) {
			throw new Exception ("Erro ao inserir o usuario: " + e.getMessage());
		}finally{
			pst.close();
		}
	}
	
}
