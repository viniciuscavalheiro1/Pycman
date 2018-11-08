package TestesClasses;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.sistemabancario.entidades.auxiliares.Tipo;
import br.com.sistemabancario.entidades.conta.Conta_Corrente_Poupanca;
import br.com.sistemabancario.entidades.conta.Conta_Poupanca;

class Conta_Corrente_PoupancaTest {

	Conta_Corrente_Poupanca conta;
	Conta_Poupanca conta2;
	
	@BeforeEach
	void setUp() throws Exception {
		conta = new Conta_Corrente_Poupanca("1111", "Vinicius", "111",Tipo.CONTA_CORRENTE_POUPANCA, 900);
		conta2 = new Conta_Poupanca("222", "User", "222", Tipo.CONTA_POUPANCA, 0);
	}

	@Test
	void testSacar() {
		assertEquals(1, conta.sacar(800));
	}
	
	@Test
	void testSacaMais() {
		assertEquals(0, conta.sacar(10000));
	}
	
	@Test
	void testScarMenos() {
		assertEquals(0, conta.sacar(-100));
	}
	
	@Test
	void testDepositar() {
		assertEquals(1, conta.depositar(1000));
	}

	@Test
	void testDepositarAcimaMedia() {
		assertEquals(1, conta.depositar(200000));
	}
	
	@Test
	void testDepositarValorMenor() {
		assertEquals(1, conta.depositar(-300));
	}

	@Test
	void testTransferencia() {
		assertEquals(1, conta.transferir(conta2, 300));
	}
	
	@Test
	void testTransferenciaInvalida() {
		assertEquals(0, conta.transferir(conta2, -300));
	}

	@Test
	void testTransferenciaValorZero() {
		assertEquals(0, conta.transferir(conta2, 0));
	}
	
	@Test
	void testTransferenciaValorAcimaDoPermitido() {
		assertEquals(0, conta.transferir(conta2, 500000));
	}
	
	@Test


	
	
}
