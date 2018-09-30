package br.com.sistemabancario.entidades.usuarios;


public class Gerente extends Usuario{

	
	public Gerente(String usuario, String senha) {
		super(usuario, senha);	
	}

	public boolean validaLoginGerente() {
		
		for(Gerente c : br.com.sistemabancario.aplicacao.Application.gerentes) {
			if(this.usuario.equals(c.usuario) && this.senha.equals(c.senha))
				return true;
		}
		return false;
	}
}
