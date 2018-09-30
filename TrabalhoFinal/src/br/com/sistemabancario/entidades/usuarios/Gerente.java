package br.com.sistemabancario.entidades.usuarios;


public class Gerente extends Usuario{

	public Gerente(String usuario, String senha) {
		super(usuario, senha);	
	}

	public Gerente validaLoginCliente() {
		for(Gerente g : br.com.sistemabancario.aplicacao.Application.gerentes) {
			if(usuario.equals(g.getUsuario()) && senha.equals(g.getSenha())) {
				return g;
			}
		}
		return null;		
	}
}
