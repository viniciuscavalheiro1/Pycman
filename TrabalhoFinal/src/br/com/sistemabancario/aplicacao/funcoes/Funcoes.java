package br.com.sistemabancario.aplicacao.funcoes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import br.com.sistemabancario.entidades.auxiliares.Tipo;
import br.com.sistemabancario.entidades.conta.Conta;
import br.com.sistemabancario.entidades.conta.Conta_Corrente;
import br.com.sistemabancario.entidades.conta.Conta_Corrente_Poupanca;
import br.com.sistemabancario.entidades.conta.Conta_Poupanca;
import br.com.sistemabancario.entidades.usuarios.Cliente;
import br.com.sistemabancario.entidades.usuarios.Gerente;

public class Funcoes {

	static File contas = new File("C:\\Users\\PC\\Desktop\\trab\\TrabalhoFinal\\Banco de Dados\\CONTAS.txt");
	static File gerentes = new File("C:\\Users\\PC\\Desktop\\trab\\TrabalhoFinal\\Banco de Dados\\GERENTES.txt");
	static File clientes = new File("C:\\Users\\PC\\Desktop\\trab\\TrabalhoFinal\\Banco de Dados\\CLIENTES.txt");
	static Scanner scanner = null;
		
	public static void lerArquivos() {
			 
			 try {
				 scanner = new Scanner(contas);
				 while(scanner.hasNextLine()) {
					 String[] vetor = scanner.nextLine().split(" ");
					 String tipo = vetor[0];
					 Tipo tipoT = Tipo.valueOf(tipo);
					 String numConta = vetor[1];
					 String nome = vetor[2];
					 String senhaCad = vetor[3];
					 float saldo = Float.parseFloat(vetor[4]);
					 criarConta(tipoT, numConta, nome, senhaCad, saldo);
				 }
				 
				 scanner = new Scanner(gerentes);
				 while(scanner.hasNextLine()) {
					 String[] vetor = scanner.nextLine().split(" ");
					 String usuario = vetor[0];
					 String senha = vetor[1];
					 criarGerentes(usuario, senha);					 
				 }
				 
				 scanner = new Scanner(clientes);
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
			 
			 String path = "C:\\Users\\PC\\Desktop\\trab\\TrabalhoFinal\\Banco de Dados\\CONTAS.txt";
			 String str;
			 try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
				 for(Conta c: br.com.sistemabancario.aplicacao.Application.contas) {	
					 
					 str = c.mensagemDeArmazenar();										  					
					 bw.write(str);	
					 bw.newLine();
				 }
					 		 
			 }catch(IOException e) {
				 e.printStackTrace();
			 }
			 
			path = "C:\\Users\\PC\\Desktop\\trab\\TrabalhoFinal\\Banco de Dados\\CLIENTES.txt";
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
				 for(Cliente c: br.com.sistemabancario.aplicacao.Application.clientes) {	
					 
					 str = c.mensagemDeArmazenar();										  					
					 bw.write(str);	
					 bw.newLine();
				 }
					 		 
			 }catch(IOException e) {
				 e.printStackTrace();
			 }
			 
		}
		
	public static void criarConta(Tipo tipoConta, String numConta, String nome, String senhaCad, float saldo) { 			 
			 
			Cliente c = new Cliente(numConta, senhaCad);
			br.com.sistemabancario.aplicacao.Application.clientes.add(c);
		  if(tipoConta.equals(Tipo.CONTA_POUPANCA)) {
			  Conta_Poupanca conta = new Conta_Poupanca(numConta, nome, senhaCad, Tipo.CONTA_POUPANCA, saldo);	
			  br.com.sistemabancario.aplicacao.Application.contas.add(conta);
			  c.setC(conta);
		  }else if (tipoConta.equals(Tipo.CONTA_CORRENTE)){
			  Conta_Corrente conta = new Conta_Corrente(numConta, nome, senhaCad, Tipo.CONTA_CORRENTE, saldo);		
			  br.com.sistemabancario.aplicacao.Application.contas.add(conta);
			  c.setC(conta);
		  }else {
			  Conta_Corrente_Poupanca conta = new Conta_Corrente_Poupanca(numConta,  nome,  senhaCad, Tipo.CONTA_CORRENTE_POUPANCA, saldo);
			  br.com.sistemabancario.aplicacao.Application.contas.add(conta);
			  c.setC(conta);
		  }	
	
	  }	 
		
	public static void criarGerentes(String user,String senha) {
		Gerente g = new Gerente(user, senha);
		br.com.sistemabancario.aplicacao.Application.gerentes.add(g);
	}
	
	public static Conta buscarConta(String numConta) {
		for(Conta c : br.com.sistemabancario.aplicacao.Application.contas) {
			if(numConta.equals(c.getNumConta())) {
				return c;
			}
		}
		return null;		
	}
	
		
	public static void exibirContas() {
		
		for(Conta c : br.com.sistemabancario.aplicacao.Application.contas) {
			System.out.println(c.toString());
		}
	}
}
