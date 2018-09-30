package br.com.sistemabancario.entidades.conta;

public class Conta {

	private String numConta;
	private String nome;
	private String senhaCad;
	private int tipo;
		 
	Conta(String numConta, String nome, String senhaCad, int tipo) {
		this.numConta = numConta;
		this.nome = nome;
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
	
	public int get_tipo() {
		return tipo;
	}
	
	public void set_tipo(int tipo) {
		this.tipo = tipo;
	}
	
	public boolean valida_saque(float saldo, float valor) {
		if (valor > saldo) {
			return false;
		}
		return true;
	}
	
	public String tipoConta() {
		if (get_tipo() == 1) {
			return "Corrente";
		}else if(get_tipo() == 2) {
			return "Poupança";
		}
		return "Corrente/Poupança";
	}

	public String mensagemDeArmazenar() {
		return  tipo + 
				 tipoConta() +
				 numConta +
				 " " +
				 nome +
				 " " +
				 senhaCad;
	}
	
	
	@Override
	public String toString() {
		
		return numConta +
				 " " +
				 nome +
				 " " +
				 senhaCad;
	}
	
	
}