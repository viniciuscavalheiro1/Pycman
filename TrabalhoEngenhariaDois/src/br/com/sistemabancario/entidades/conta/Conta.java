package br.com.sistemabancario.entidades.conta;

public class Conta {

	 protected String numConta;
	 protected String nome;
	 protected float saldo;
	 protected String senhaCad;
	 protected int tipo;
	 
	 
	
	public Conta(String numConta, String nome, String senhaCad, int tipo) {
		this.numConta = numConta;
		this.nome = nome;
		this.saldo = 0f;
		this.senhaCad = senhaCad;
		this.tipo = tipo;
	}



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
