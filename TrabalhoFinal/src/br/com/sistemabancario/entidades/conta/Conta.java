package br.com.sistemabancario.entidades.conta;

import br.com.sistemabancario.entidades.auxiliares.Tipo;

public class Conta {

	 private String numConta;
	 private String nome;
	 private float saldo;
	 private String senhaCad;
	 private Tipo tipo;
	 
		 	
	public Conta(String numConta, String nome,String senhaCad, Tipo tipo, float saldo) {
		this.numConta = numConta;
		this.nome = nome;
		this.senhaCad = senhaCad;
		this.tipo = tipo;
		this.saldo = saldo;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenhaCad() {
		return senhaCad;
	}

	public void setSenhaCad(String senhaCad) {
		this.senhaCad = senhaCad;
	}

	
	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public float getSaldo() {
		return saldo;
	}
	
	public String mensagemDeArmazenar() {
		return  tipo + 
				 " " +
				 numConta +
				 " " +
				 nome +
				 " " +
				senhaCad +
				" " +
				saldo;
	}

	public void depositar(float valor) {
		this.saldo += valor;
	}
	
	@Override
	public String toString() {
		return "Tipo da Conta: "+
				getTipo() +
				", Numero da conta: " +
				getNumConta() +
				", Nome do Titular: " +
				getNome() +
				String.format(", Saldo: %.2f", getSaldo()) +
				" R$";
	}
	
	
	
}
