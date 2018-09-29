package br.com.sistemabancario.aplicacao.funcoes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import br.com.sistemabancario.entidades.conta.Conta;
import br.com.sistemabancario.entidades.conta.Conta_Corrente;
import br.com.sistemabancario.entidades.conta.Conta_Corrente_Poupanca;
import br.com.sistemabancario.entidades.conta.Conta_Poupanca;
import br.com.sistemabancario.entidades.usuarios.Gerente;

public class Funcoes {

	static File contas = new File("C:\\Users\\PC\\eclipse-workspace\\TrabalhoEngenhariaDois\\Banco de Dados\\BD.txt");
	static File gerentes = new File("C:\\Users\\PC\\eclipse-workspace\\TrabalhoEngenhariaDois\\Banco de Dados\\GERENTES.txt");
	static Scanner scanner = null;
	
	public static void lerArquivos() {
			 
			 try {
				 scanner = new Scanner(contas);
				 while(scanner.hasNextLine()) {
					 String[] vetor = scanner.nextLine().split(" ");
					 int tipo = Integer.parseInt(vetor[0]);
					 String numConta = vetor[1];
					 String nome = vetor[2];
					 String senhaCad = vetor[3];
					 criarConta(tipo, numConta, nome, senhaCad);
				 }
				 
				 scanner = new Scanner(gerentes);
				 while(scanner.hasNextLine()) {
					 String[] vetor = scanner.nextLine().split(" ");
					 String usuario = vetor[0];
					 String senha = vetor[1];
					 criarGerentes(usuario, senha);					 
				 }
				 
				 
				 
			 } catch(IOException e) {
				 System.out.println("Error " + e.getMessage());
			 }finally {
				 if(scanner != null)
					 scanner.close();
			 }
		 }
		
		public static void armazenarArquivo() {
			 
			 String path = "C:\\Users\\PC\\eclipse-workspace\\TrabalhoEngenhariaDois\\Banco de Dados\\BD.txt";
			 
			 try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
				 for(Conta c: br.com.sistemabancario.aplicacao.Application.contas) {				 
					 String str = c.toString();
					 bw.write(str);	
					 bw.newLine();
				 }
					 		 
			 }catch(IOException e) {
				 e.printStackTrace();
			 }
		}
		
	public static void criarConta(int tipoConta, String numConta, String nome, String senhaCad) { 			 
			 
		  if(tipoConta == 1) {
			  Conta_Poupanca conta = new Conta_Poupanca(numConta, nome, senhaCad, 1);	
			  br.com.sistemabancario.aplicacao.Application.contas.add(conta);
		  }else if (tipoConta == 2) {
			  Conta_Corrente conta = new Conta_Corrente(numConta, nome, senhaCad, 2);		
			  br.com.sistemabancario.aplicacao.Application.contas.add(conta);
		  }else {
			  Conta_Corrente_Poupanca conta = new Conta_Corrente_Poupanca(numConta,  nome,  senhaCad, 3);
			  br.com.sistemabancario.aplicacao.Application.contas.add(conta);
		  }		
	
	  }	 
		
	public static void criarGerentes(String user,String senha) {
		Gerente g = new Gerente(user, senha);
		br.com.sistemabancario.aplicacao.Application.gerentes.add(g);
	}
	
}
