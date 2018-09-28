package br.com.sistemabancario.entities.conta;

public class Conta {

	 protected String numConta;
	 protected String nome;
	 protected float saldo;
	 protected String senhaCad;
	 protected int tipo;
	 
	
	@Override
	public String toString() {
		
		return  tipo + 
				 " " +
				 numConta +
				 " " +
				 nome +
				 " " +
				 senhaCad;
	}
	
	
}
