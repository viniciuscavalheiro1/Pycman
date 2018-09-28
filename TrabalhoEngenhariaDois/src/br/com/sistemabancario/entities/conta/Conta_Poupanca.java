package br.com.sistemabancario.entities.conta;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.sistemabancario.application.BancoDeDados.BancoDeDados;

public class Conta_Poupanca extends Conta{

	BancoDeDados contaPoupanca = new BancoDeDados();
	
	public Conta_Poupanca(){
		
	}
	public void cadastroBD() {
        contaPoupanca.conectar();
        String sql = "INSERT INTO Contas("
            + "NumeroConta,"
            + "Nome,"
            + "Saldo,"
            + "Senha,"
            + "Tipo"
            + ") VALUES(?,?,?,?,?)"
            +";";


        PreparedStatement prepare = contaPoupanca.criarPreparedStatement(sql);

        try{
            prepare.setInt(1,getNumConta());
            prepare.setString(2,getNome());
            prepare.setFloat(3,getSaldo());
            prepare.setString(4,getSenha());
            prepare.setInt(5,getTipo());
            prepare.executeUpdate();
            System.out.println("Conta cadastrada com sucesso! ");
        }catch(SQLException e){
            e.printStackTrace();
            System.out.println("Erro ao Cadastrar");
        }finally{
            if(prepare != null){
                try {
                    prepare.close();
                } catch (SQLException ex) {
                    System.out.println("Erro ao fechar o banco");
                }
            }
        }
        contaPoupanca.desconectar();
    }    
	
	
}
