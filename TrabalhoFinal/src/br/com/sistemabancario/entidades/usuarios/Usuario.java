package br.com.sistemabancario.entidades.usuarios;

public class Usuario {
	
	protected String usuario;
	protected String senha;
	
		
	public Usuario(String numConta, String senha) {
		this.usuario = numConta;
		this.senha = senha;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
