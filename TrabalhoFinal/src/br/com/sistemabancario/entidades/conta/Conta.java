package br.com.sistemabancario.entidades.conta;

import br.com.sistemabancario.entidades.auxiliares.Tipo;

public class Conta {

	private String numConta;
	private String nome;
	private String senhaCad;
	private Tipo tipo;
	private float saldo;
		 
	Conta(String numConta, String nome, String senhaCad, Tipo tipo, float saldo) {
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
	
	public Tipo get_tipo() {
		return tipo;
	}
		
	public float getSaldo() {
		return saldo;
	}
	
	public int sacar(float valor) {
		
		boolean flag = valida_transacao(this.saldo, valor);
		if(flag) {
			this.saldo -= valor;
			return 1;
		}else {
			return 0;
		}
	}
	
	public int depositar(float valor) {
		if(validaDeposito(valor)) {
			this.saldo += valor;
			return 1;
		}else {
			return 0;
		}
	}
	
	public int transferir(Conta c, float valor) {
		boolean flag = valida_transacao(this.saldo, valor);
		
		if(flag) {
			c.depositar(valor);
			sacar(valor);
			return 1;
		}else { 
			return 0;
		}
	}
	
	public boolean valida_transacao(float saldo, float valor) {
		if (valor > saldo || valor <= 0 || valor >= 500000) {
			return false;
		}
		return true;
	}
	
	public boolean validaDeposito(float valor) {
		if (valor <= 0 || valor >= 1000) {
			return true;
		}else {
			return false;
		}
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
	@Override
	public String toString() {
		return "Tipo da Conta: "+
				tipo +
				", Numero da conta: " +
				getNumConta() +
				", Nome do Titular: " +
				getNome() +
				", Saldo: " +
				getSaldo( ) +
				" R$";
	}
	
	
}