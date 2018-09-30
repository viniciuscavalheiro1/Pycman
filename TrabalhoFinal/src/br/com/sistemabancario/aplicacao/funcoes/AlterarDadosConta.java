package br.com.sistemabancario.aplicacao.funcoes;

import java.util.Scanner;

import br.com.sistemabancario.entidades.conta.Conta;

public class AlterarDadosConta {

	static Scanner sc = new Scanner(System.in);
	
	public static void alterarDados(Conta c) {
		
		System.out.println("Informe o novo numero da conta: ");
		c.setNumConta(sc.nextLine());
		
		System.out.println("Informe o nome do Titular da conta: ");
		c.setNome(sc.nextLine());
		
		System.out.println("Informe a nova senha da conta: ");
		c.setSenhaCad(sc.nextLine());
		
	}
	
	public static void alterarDadoEspecifico(int opcao, Conta c) {
		if(opcao == 1) {
			System.out.println("Informe o novo numero da conta: ");
			c.setNumConta(sc.nextLine());
		}else if(opcao == 2) {
			System.out.println("Informe o nome do Titular da conta: ");
			c.setNumConta(sc.nextLine());
		}else if (opcao == 3){
			System.out.println("Informe o nome do Titular da conta: ");
			c.setNumConta(sc.nextLine());
		}else {
			System.out.println("Opcao nao encontrada!");
		}
				
	}

}
