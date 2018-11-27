package TestesClasses;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.sistemabancario.entidades.auxiliares.Tipo;
import br.com.sistemabancario.entidades.conta.Conta_Corrente;

class Conta_CorrenteTest {

	Conta_Corrente conta;
	Conta_Corrente conta2;
	
	
	@BeforeEach
	void setUp() throws Exception {
		conta = new Conta_Corrente("1111", "UserTest", "1234", Tipo.CONTA_CORRENTE, 1000);
		conta2 = new Conta_Corrente("2222", "UserTest2", "4321", Tipo.CONTA_CORRENTE, 900);
		
	}

	@Test
	void testDeposito() {
		assertEquals(0, conta.depositar(-100));
	}
	
	@Test
	void testDepositoZero() {
		assertEquals(0, conta2.depositar(0));
	}

	//
	@Test
	void testDepositarAcima() {
		assertEquals(0, conta2.depositar(1000000));
	}
	
	@Test
	void testDepositoNormal() {
		assertEquals(1, conta2.depositar(1000));
	}
	
	@Test
	void testSacar() {
		assertEquals(1, conta2.sacar(400));
	}
	
	@Test
	void testSacarZero() {
		assertEquals(0, conta2.sacar(0));
	}
	
	@Test
	void testSacarAcimaPermitido() {
		assertEquals(0, conta2.sacar(4000000));
	}
	
	@Test
	void testTransferenciaZero() {
		assertEquals(0, conta2.transferir(conta, 0));
	}
	
	@Test
	void testTransferenciaNegativa() {
		assertEquals(0, conta2.transferir(conta, -200));
	}
	
	@Test
	void testTransferenciaNormal() {
		assertEquals(1, conta2.transferir(conta, 150));
	}
	
	@Test
	void testTransferenciaAcimapermitido() {
		assertEquals(0, conta2.transferir(conta, 400000));
	}
	
 }
