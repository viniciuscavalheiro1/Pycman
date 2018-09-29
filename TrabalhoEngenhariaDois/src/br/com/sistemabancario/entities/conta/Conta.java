package br.com.sistemabancario.entities.conta;

public class Conta {

	private String numConta;
	private String nome;
	private float saldo;
	private String senhaCad;
	private int tipo;
	//Para que esse int tipo
	 
	Conta(String numConta, String nome, String senhaCad) {
		this.numConta = numConta;
		this.nome = nome;
		this.saldo = 0;
		this.senhaCad = senhaCad;
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

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
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
