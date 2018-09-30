package br.com.sistemabancario.entidades.usuarios;

import br.com.sistemabancario.entidades.conta.Conta;

public class Cliente extends Usuario {

	private Conta c;
		
	public Cliente(String usuario, String senha) {
		super(usuario, senha);	
	}	
			
	public Conta getC() {
		return c;
	}

	public void setC(Conta c) {
		this.c = c;
	}

	public  Cliente validaLoginCliente() {
		for(Cliente c : br.com.sistemabancario.aplicacao.Application.clientes) {
			if(usuario.equals(c.getUsuario()) && senha.equals(c.getSenha())) {
				return c;
			}
		}
		return null;		
	}
	
	public String mensagemDeArmazenar() {
		return usuario +
				" " +
				senha;
	}
	
}
