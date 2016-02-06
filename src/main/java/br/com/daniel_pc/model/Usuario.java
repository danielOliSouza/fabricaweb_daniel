package br.com.daniel_pc.model;

public class Usuario {
	private int cod_user;
	private String nome_user;
	private String login_user;
	private String passwd_user;
	
	public int getCod_user() {
		return cod_user;
	}
	public void setCod_user(int cod_user) {
		this.cod_user = cod_user;
	}
	public String getNome_user() {
		return nome_user;
	}
	public void setNome_user(String nome_user) {
		this.nome_user = nome_user;
	}
	public String getLogin_user() {
		return login_user;
	}
	public void setLogin_user(String login_user) {
		this.login_user = login_user;
	}
	public String getPasswd_user() {
		return passwd_user;
	}
	public void setPasswd_user(String passwd_user) {
		this.passwd_user = passwd_user;
	}
}
