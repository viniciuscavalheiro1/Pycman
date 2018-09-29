package br.com.sistemabancario.entidades.conta;

public class Conta {

	 private String numConta;
	 private String nome;
	 private float saldo;
	 private String senhaCad;
	 private int tipo;
	 
	public Conta(String numConta, String nome, String senhaCad, int tipo) {
		this.numConta = numConta;
		this.nome = nome;
		this.saldo = 0f;
		this.senhaCad = senhaCad;
		this.tipo = tipo;
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

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
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
				 senhaCad;
	}

	@Override
	public String toString() {
		return "Tipo da Conta: "+ getTipo() + ", Numero da conta: " + getNumConta() + ", Nome do Titular: " + getNome() + String.format(", Saldo: %.2f", getSaldo())+ " R$";
	}
	
	
	
}
