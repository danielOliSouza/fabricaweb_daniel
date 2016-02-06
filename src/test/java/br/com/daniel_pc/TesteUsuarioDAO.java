package br.com.daniel_pc;

import br.com.daniel_pc.model.Usuario;
import br.com.daniel_pc.model.UsuarioDAO;

public class TesteUsuarioDAO {

	public static void main(String[] args) {
		Usuario usuario = new Usuario();;
		usuario.setCod_user(2);
		
		UsuarioDAO userDao = null;
		
		try {
			userDao = new UsuarioDAO();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			userDao.deleteUser(usuario);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
