package br.com.sistemabancario.entidades.usuarios;

public class Usuario {
	
	protected String usuario;
	protected String senha;
	
		
	public Usuario(String numConta, String senha) {
		this.usuario = numConta;
		this.senha = senha;
	}

}
