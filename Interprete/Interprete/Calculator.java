package Interprete;

/**
 * Clase main del intérprete Lisp del Proyecto.
 * @author Javier Alvarado, Mario Guerra, Linda Jiménez
 * @see Calculator
 */

public class Calculator {
    
	public String calcularOperacion(String expresion) {
		StackArrayList <Double> resultado = new StackArrayList<Double>();
		Double result = null;
		String resultadoRp = expresion.replace("(","").replace(")","");
		
		int n = resultado.count()+1;
		String[] operandos = resultadoRp.split(" ");
		for(int i=operandos.length-1;i>=0;i--){
			String aux = operandos[i];
		try {
			resultado.push(Double.parseDouble(aux));
		}catch(Exception e) {
			if(aux.equals("+")) {
				result = resultado.pull();
        		for(int x = 0; x < n; x++) {
        			result += resultado.pull();
        		}
        		resultado.push(result);
        	}else if(aux.equals("-")) {
        		result = resultado.pull();
        		for(int x = 0; x < n; x++) {
        			result -= resultado.pull();
        		}
        		resultado.push(result);
        	}else if(aux.equals("*")) {
        		result = resultado.pull();
        		for(int x = 0; x < n; x++) {
        			result *= resultado.pull();
        		}
        		resultado.push(result);
        	}else if(aux.equals("/")) {
        		result = resultado.pull();
        		for(int x = 0; x < n; x++) {
        			result /= resultado.pull();
        		}
        		resultado.push(result);
        	}
		}

	}
		//System.out.println(result);
		
		return Double.toString(resultado.pull()).replace(".0","");
	}
}
