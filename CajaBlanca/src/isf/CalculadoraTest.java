package isf;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma() {
		Calculadora calculadora = new Calculadora(5,3);
		int resultado = calculadora.suma();
		int esperado = 8; // 5 + 3 = 8
		assertEquals(esperado,resultado);
	}

	@Test
	void testResta() {
		Calculadora calculadora = new Calculadora(5,3);
		int resultado = calculadora.resta();
		int esperado = 2; // 5-3 = 2
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testMultiplica() {
		Calculadora calculadora = new Calculadora(5,3);
		int resultado = calculadora.multiplica();
		int esperado = 15; //5*3 = 15
		assertEquals(esperado,resultado);
	}
	
	@Test
	void testDivide() {
		Calculadora calculadora = new Calculadora(15,3);
		int resultado = calculadora.divide();
		int esperado = 5; // 15/3 = 5
		assertEquals(esperado, resultado);
	}
}
