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

	public boolean validaLoginCliente() {
		
		for(Gerente c : br.com.sistemabancario.aplicacao.Application.clientes) {
			if(this.usuario.equals(c.usuario) && this.senha.equals(c.senha))
				return true;
		}
		return false;
	}
	
}
