package br.com.sistemabancario.entities.conta;


public class Conta_Corrente_Poupanca extends Conta{
	private float saldo;

	Conta_Corrente_Poupanca(String numConta, String nome, String senhaCad) {
		super(numConta, nome, senhaCad, 3);
	}

	public float get_saldo() {
		return saldo;
	}
	
	public void deposita(float valor) {
		this.saldo += valor;
	}
	
	public void sacar(float valor) {
		if (valida_saque(get_saldo(), valor)) {
			this.saldo -= valor;
		}else {
			System.out.println("ATENÇÂO!: Sua conta não contem Saldo suficiente");
		}
	}
	
	/**
	 * Sobrecarga dos metodos de transferencia
	 * @param valor
	 * @param receptor
	 */
	public void transferencia(float valor, Conta_Corrente_Poupanca receptor) {
		if(valida_saque(get_saldo(), valor)) {
			receptor.deposita(valor);
		}
	}
	
	public void transferencia(float valor, Conta_Corrente receptor) {
		if(valida_saque(get_saldo(), valor)) {
			receptor.deposita(valor);
		}
	}
	
	public void transferencia(float valor, Conta_Poupanca receptor) {
		if(valida_saque(get_saldo(), valor)) {
			receptor.deposita(valor);
		}
	}
		
}