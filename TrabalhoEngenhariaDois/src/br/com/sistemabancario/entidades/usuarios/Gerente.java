package br.com.sistemabancario.entidades.usuarios;


public class Gerente extends Usuario{

	private String usuario;
	private String senha;
	
		
	public Gerente(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}


	public boolean validaLoginGerente() {
		
		for(Gerente c : br.com.sistemabancario.aplicacao.Application.gerentes) {
			if(this.usuario.equals(c.usuario) && this.senha.equals(c.senha))
				return true;
		}
		return false;
	}
}
