package Interprete;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InterpreteLispTest {

      InterpreteLisp lispinterpreterTest1 = new InterpreteLisp();
	
	@Test
	void testInterpretFactorial() {
		String mesagge = lispinterpreterTest1.interpretarCodigo("(defun factorial (n) (cond (= n 0) (1) (* n (factorial (- n 1)))))");
		assertEquals("Function 'factorial' has been created.\nType (help) or (functions) to see the details of your function.", mesagge);
		String value = lispinterpreterTest1.interpretarCodigo("(factorial (4))");
		assertEquals("24", value);
	}
	
	@Test
	void testInterpretAdittion() {
		String value = lispinterpreterTest1.interpretarCodigo("(+ 2 2 2)");
		assertEquals("6", value);
	}
	
	@Test
	void testInterpretExponent() {
		String mesagge = lispinterpreterTest1.interpretarCodigo("(Defun exponent (x) (* x x))");
		assertEquals("Function 'exponent' has been created.\nType (help) or (functions) to see the details of your function.", mesagge);
		String value = lispinterpreterTest1.interpretarCodigo("(exponent (10))");
		assertEquals("100", value);
	}
	
	@Test
	void testInsterpretSubtraction() {
		String value = lispinterpreterTest1.interpretarCodigo("(- 10 2 2)");
		assertEquals("6", value);
	}
	
	@Test
	void testInterpretMultiplication() {
		String value = lispinterpreterTest1.interpretarCodigo("(* 2 2 2)");
		assertEquals("8", value);
	}
	
	@Test
	void testInterpretDivision() {
		String value = lispinterpreterTest1.interpretarCodigo("(/ 100 2 2)");
		assertEquals("25", value);
	}
	
	@Test
	void testInterpretAtomT() {
		String value = lispinterpreterTest1.interpretarCodigo("(atom 1)");
		assertEquals("T", value);
	}
	
	@Test
	void testAtomNIL() {
		String value = lispinterpreterTest1.interpretarCodigo("(atom 1 2)");
		assertEquals("NIL", value);
	}
	
	@Test
	void testEqualsT() {
		String value = lispinterpreterTest1.interpretarCodigo("(= 1 1)");
		assertEquals("T", value);
	}
	
	@Test
	void testEqualsNIL() {
		String value = lispinterpreterTest1.interpretarCodigo("(= 1 2)");
		assertEquals("NIL", value);
	}
	
	@Test
	void testList() {
		String value = lispinterpreterTest1.interpretarCodigo("(list 1 2 3)");
		assertEquals("(1, 2, 3)", value);
	}
	
	@Test
	void testLessThanT() {
		String value = lispinterpreterTest1.interpretarCodigo("(< 1 3)");
		assertEquals("T", value);
	}
	
	@Test
	void testLessThanNIL() {
		String value = lispinterpreterTest1.interpretarCodigo("(< 5 2)");
		assertEquals("NIL", value);
	}
	
	@Test
	void testGreaterThanT() {
		String value = lispinterpreterTest1.interpretarCodigo("(> 9 2)");
		assertEquals("T", value);
	}
	
	@Test
	void testGreaterThanNIL() {
		String value = lispinterpreterTest1.interpretarCodigo("(> 2 9)");
		assertEquals("NIL", value);
	}
}
