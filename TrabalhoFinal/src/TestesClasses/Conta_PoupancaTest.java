package TestesClasses;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.sistemabancario.entidades.auxiliares.Tipo;
import br.com.sistemabancario.entidades.conta.Conta_Corrente_Poupanca;
import br.com.sistemabancario.entidades.conta.Conta_Poupanca;

class Conta_PoupancaTest {
	
	Conta_Poupanca conta;
	Conta_Corrente_Poupanca conta2;

	@BeforeEach
	void setUp() throws Exception {
		conta = new Conta_Poupanca("3333", "UserTest", "1010", Tipo.CONTA_POUPANCA, 10000);
		conta2 = new Conta_Corrente_Poupanca("444", "UserTest2", "0101", Tipo.CONTA_CORRENTE_POUPANCA, 1000);
	}

	@Test
	void testDeposito() {
		assertEquals(1, conta.depositar(1000));
	}
	
	@Test
	void testDepositoInvalido() {
		assertEquals(0, conta.depositar(-1000));
	}
	
	@Test
	void testDepositoAcimaPermitido() {
		assertEquals(0, conta.depositar(500000));
	}
	
	@Test
	void testDepositoZero() {
		assertEquals(0, conta.depositar(0));
	}
	
	@Test
	void testSaque() {
		assertEquals(1, conta.sacar(100));
	}
	
	@Test
	void testSaqueAbaixoZero() {
		assertEquals(0, conta.sacar(-1000));
	}
	
	@Test
	void testSaqueZero() {
		assertEquals(0, conta.sacar(0));
	}
	
	@Test
	void testSaqueAcimaPermitido() {
		assertEquals(0, conta.sacar(1000000));
	}
	
	@Test
	void testTransferencia() {
		assertEquals(1, conta.transferir(conta2, 1000));
	}
	
	@Test
	void testTransferenciaInvalida() {
		assertEquals(0, conta.transferir(conta2, -10000));
	}
	
	@Test
	void testTransferenciaZero() {
		assertEquals(0, conta.transferir(conta2, 0));
	}
	
	@Test
	void testTransferenciaAcimaPermitido() {
		assertEquals(0, conta.transferir(conta2, 600000));
	}
}
