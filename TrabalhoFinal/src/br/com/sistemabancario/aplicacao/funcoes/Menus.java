package br.com.sistemabancario.aplicacao.funcoes;

import java.util.Scanner;

import br.com.sistemabancario.entidades.auxiliares.Tipo;

public class Menus {

	static Scanner sc = new Scanner(System.in);
	
	public static int menuGerente() {
        System.out.println("\n ------> 1 - Cadastrar Conta  ");
        System.out.println(" ------> 2 - Remover  Conta     ");
        System.out.println(" ------> 3 - Atualizar Conta    ");
        System.out.println(" ------> 4 - Mostrar contas     ");
        System.out.println(" ------> 0 - Sair");
        return sc.nextInt();
	}
	
	public static Tipo tipoConta() {
        System.out.println("\nInforme tipo da conta: ");
        System.out.println(" ------> 1 - Conta Poupanca");
        System.out.println(" ------> 2 - Conta Corrente");
        System.out.println(" ------> 3 - Conta Corrente-Poupanca");
        int num = sc.nextInt();
        if(num == 1) {
        	return Tipo.CONTA_POUPANCA;
        }else if(num == 2) {
        	return Tipo.CONTA_CORRENTE;
        }else if(num == 3) {
        	return Tipo.CONTA_CORRENTE_POUPANCA;
        }
		return null;
	}
	
	 public static int menuCliente(){
         System.out.println("\n ------> 1 - Sacar");
         System.out.println(" ------> 2 - Depositar");
         System.out.println(" ------> 3 - Transferir");
         System.out.println(" ------> 0 - Sair");
         System.out.print("OPCAO: ");
         return sc.nextInt();
     }
	 
	  public static void MostrarDados(){
          System.out.println("\n ------> n 1 - Listar todas as contas      ");
          System.out.println(" ------> 2 - Mostrar uma conta especifica ");
      }  
	  
	  public static int menuAlterarDados() {
		  System.out.println("\n ------> 1 - Alterar todos os Dados      ");
          System.out.println(" ------> 2 - Alterar dado Especifico ");
          return sc.nextInt();
	  }
	  
	  public static int menuDadoEspecifico() {
		  System.out.println("\n ------> 1 - Numero da Conta      ");
          System.out.println(" ------> 2 - Nome do Titular ");
          System.out.println(" ------> 3 - Senha    ");          
          return sc.nextInt();
	  }
	  
}
