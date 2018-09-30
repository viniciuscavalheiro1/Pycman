package br.com.sistemabancario.entidades.conta;

import br.com.sistemabancario.entidades.auxiliares.Tipo;

public class Conta_Corrente extends Conta{
	
	
	public Conta_Corrente(String numConta, String nome, String senhaCad, Tipo tipo, float saldo) {
		super(numConta, nome, senhaCad, tipo, saldo);

	}
	
	
	
}