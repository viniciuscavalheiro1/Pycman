package br.com.sistemabancario.aplicacao;


import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import br.com.sistemabancario.entidades.conta.Conta;
import br.com.sistemabancario.entidades.usuarios.Gerente;

public class Application {
	
	static Scanner sc = new Scanner(System.in);
	public static ArrayList<Conta> contas = new ArrayList<>();
	public static ArrayList<Gerente> gerentes = new ArrayList<>();

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		// Lê o arquivo com todas as contas do banco
		br.com.sistemabancario.aplicacao.funcoes.Funcoes.lerArquivos();
		

		
		System.out.println("-------------------------------------");
		System.out.println();
		System.out.println("    Sistema gerenciador Bancário");
		System.out.println();
		System.out.println("-------------------------------------");
		
		int opcao = 0;
		do {			
			System.out.println("Acesso ao Banco:");
            System.out.println("1 - Gerente");
            System.out.println("2 - Cliente");
            System.out.println("0 - Sair");
            System.out.print("OPCAO: ");
             
            try{
                opcao = sc.nextInt();
            }catch(Exception erro){
                System.out.println("ATENCAO: Somente Numeros!");
            }
            
            switch(opcao) {
            
            	case 0:
            		System.out.println("Programa encerrado");
            		break;
            	case 1:
            		System.out.println("-------------------------------------");
            		System.out.println("          Login do Gerente: ");
            		System.out.println("-------------------------------------");
            		boolean flag = false;
            		
            		do {
	            		System.out.print("Usuario: ");
	            		String usuario = sc.next();
	            		System.out.print("Senha: ");
	            		String senha = sc.next();
	            		
	            		Gerente gerente = new Gerente(usuario, senha);
	            		flag = gerente.validaLoginGerente();
	   
	            		if(flag) {           			
	            			int subOp = 1;
	            			while(subOp != 0) {
	            				 subOp = br.com.sistemabancario.aplicacao.funcoes.Menus.menuGerente();
	            				switch(subOp) {
	            					case 0:	            						  
	            						break;
	            					case 1:
	            						int tipo = br.com.sistemabancario.aplicacao.funcoes.Menus.tipoConta();
	            						sc.nextLine();
	            						System.out.println("Numero da conta: ");
	            						String numConta = sc.nextLine();
	            						System.out.println("Nome do Cliente");
                                        String nome = sc.nextLine();
                                        System.out.println("Senha da Conta");
                                        String senhaCad = sc.next();
                                        br.com.sistemabancario.aplicacao.funcoes.Funcoes.criarConta(tipo, numConta, nome, senhaCad);
                                        break;
	            					case 2:
	            						System.out.println("Informe o numero da conta que deseja remover: ");
	            						sc.nextLine();
	            						String str = sc.nextLine();
	            						int rm = br.com.sistemabancario.aplicacao.funcoes.Funcoes.buscarConta(str);
	            						if(rm != (-1)) {
	            							System.out.println("Conta removida!");
	            							contas.remove(rm);
	            						}else
	            							System.out.println("Conta nao encontrada!");
	            						break;
	            					case 3:
	            						
	            						int op = br.com.sistemabancario.aplicacao.funcoes.Menus.menuAlterarDados();
	            						System.out.println("Informe o numero da conta que deseja fazer alteracoes: ");
	            						sc.nextLine();
	            						str = sc.nextLine();
	            						int indice = br.com.sistemabancario.aplicacao.funcoes.Funcoes.buscarConta(str);
	            						Conta objc = br.com.sistemabancario.aplicacao.Application.contas.get(indice);
	            						if(op == 1)
	            							br.com.sistemabancario.aplicacao.funcoes.AlterarDadosConta.alterarDados(objc);
	            						else {
	            							int op2 = br.com.sistemabancario.aplicacao.funcoes.Menus.menuDadoEspecifico();
	            							br.com.sistemabancario.aplicacao.funcoes.AlterarDadosConta.alterarDadoEspecifico(op2, objc);
	            						}
	            						break;
	            					case 4:
	            						br.com.sistemabancario.aplicacao.funcoes.Funcoes.exibirContas();
	            						break;
	            				}
	            			}
         			            			
	            		}else {
	            			System.out.println("Usuario nao encontrado! ");
	            		}
            		}while(!flag);            		
              		
            		
            		break;
            	case 2:
            		break; 
            		
            	default:
            		System.out.println("ATENCAO: Opcao Inválida! ");
            		break;
            }
        }while(opcao != 0);
		
		// Ao encerrar o programa todas as contas são armazenadas
		br.com.sistemabancario.aplicacao.funcoes.Funcoes.armazenarArquivo();		
		sc.close();
	}
			
}
