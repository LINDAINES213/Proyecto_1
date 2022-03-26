package Interprete;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	   Calculator a = new Calculator(); 
	
		@Test
		void testCalculatorAddition() {
			String value = a.calcularOperacion("+ 2 2 2");
			assertEquals("6", value);
		}
		
		@Test
		void testCalculatorSubtraction() {
			String value = a.calcularOperacion("- 10 2 2");
			assertEquals("6", value);
		}
		
		@Test
		void testCalculatorMultiplication() {
			String value = a.calcularOperacion("* 2 2 2");
			assertEquals("8", value);
		}
		
		@Test
		void testCalculatorDivision() {
			String value = a.calcularOperacion("/ 100 2 2");
			assertEquals("25", value);
		}
		//System.out.println(result);
		
}

