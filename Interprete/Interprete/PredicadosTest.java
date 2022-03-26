package Interprete;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PredicadosTest {

	Predicados testPredicates = new Predicados();
	
	@Test
	void testAtomT() {
		String value = testPredicates.evaluarPredicado("atom 1");
		assertEquals("T", value);
	}
	
	@Test
	void testAtomNIL() {
		String value = testPredicates.evaluarPredicado("atom 1 2");
		assertEquals("NIL", value);
	}
	
	@Test
	void testEqualsT() {
		String value = testPredicates.evaluarPredicado("= 1 1");
		assertEquals("T", value);
	}
	
	@Test
	void testEqualsNIL() {
		String value = testPredicates.evaluarPredicado("= 1 2");
		assertEquals("NIL", value);
	}
	
	@Test
	void testList() {
		String value = testPredicates.evaluarPredicado("list 1 2 3");
		assertEquals("(1, 2, 3)", value);
	}
	
	@Test
	void testLessThanT() {
		String value = testPredicates.evaluarPredicado("< 1 3");
		assertEquals("T", value);
	}
	
	@Test
	void testLessThanNIL() {
		String value = testPredicates.evaluarPredicado("< 5 2");
		assertEquals("NIL", value);
	}
	
	@Test
	void testGreaterThanT() {
		String value = testPredicates.evaluarPredicado("> 9 2");
		assertEquals("T", value);
	}
	
	@Test
	void testGreaterThanNIL() {
		String value = testPredicates.evaluarPredicado("> 2 9");
		assertEquals("NIL", value);
	}
}
