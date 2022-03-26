package Interprete;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class funcionesLispTest {

	funcionesLisp f = new funcionesLisp();
	
	@Test
	void testAddVariable() {
		f.anadirHashmap("x", "10");
		boolean value = f.findVariable("x");
		assertEquals(true, value);
	}
	
	
	@Test
	void testFindVariable() {
		f.anadirHashmap("x", "10");
		f.anadirHashmap("y", "5");
		boolean value = f.findVariable("y");
		assertEquals(true, value);
	}

	@Test
	void testChangeVariablesFound() {
		f.anadirHashmap("x", "10");
		f.anadirHashmap("y", "5");
		StackArrayList<String> test = new StackArrayList<String>();
		test.push("+");
		test.push("x");
		test.push("y");
		StackArrayList<String> value = f.cambioVariable(test);
		String expected = value.get(0) + " " + value.get(1) + " " + value.get(2);
		assertEquals("+ 10 5", expected);
	}

}
