package br.com.sistemabancario.aplicacao.funcoes;

import java.util.Scanner;

public class Menus {

	static Scanner sc = new Scanner(System.in);
	
	public  static int menuGerente() {
        System.out.println("\n ------> 1 - Cadastrar ");
        System.out.println(" ------> 2 - Remover            ");
        System.out.println(" ------> 3 - Atualizar          ");
        System.out.println(" ------> 4 - Mostrar contas     ");
        System.out.println(" ------> 0 - Sair");
        return sc.nextInt();
	}
	
	public  static int tipoConta() {
        System.out.println("\nInforme tipo da conta: ");
        System.out.println(" ------> 1 - Conta Normal");
        System.out.println(" ------> 2 - Conta Poupanca");
        System.out.println(" ------> 3 - Conta Corrente  ");
        System.out.println(" ------> 4 - Conta Corrente-Poupanca");

        return  sc.nextInt();
	}
	
	 public  static int menuCliente(){
         System.out.println("\n ------> 1 - Sacar");
         System.out.println(" ------> 2 - Transferencia");
         System.out.println(" ------> 3 - Depositar");
         System.out.println(" ------> 4 - Sair");
         System.out.println("OPCAO: ");
         return sc.nextInt();
     }
	 
	  public static void MostrarDados(){
          System.out.println("\n ------> n 1 - Listar todas as contas      ");
          System.out.println(" ------> 2 - Mostrar uma conta especifica ");
      }  
	  
}
