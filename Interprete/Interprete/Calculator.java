package Interprete;

/**
 * Clase main del intérprete Lisp del Proyecto.
 * @author Javier Alvarado, Mario Guerra, Linda Jiménez
 * @see Calculator
 */

public class Calculator {
    
	public String calcularOperacion(String expresion) { //Método para calcular la expresion propuesta por el usuario.
		StackArrayList <Double> resultado = new StackArrayList<Double>(); //Creación de stack con el resultado.
		Double result = null;
		String resultadoRp = expresion.replace("(","").replace(")",""); //Reemplaza los paréntesis de la expresión Postfix por espacios en blanco.
		
		int n = resultado.count()+1;  //Cuenta los argumentos del stack.
		String[] operandos = resultadoRp.split(" ");
		for(int i=operandos.length-1;i>=0;i--){
			String aux = operandos[i];
		try {
			resultado.push(Double.parseDouble(aux));
		}catch(Exception e) {
			if(aux.equals("+")) { //Operación suma.
				result = resultado.pull();
        		for(int x = 0; x < n; x++) {
        			result += resultado.pull();
        		}
        		resultado.push(result);
        	}else if(aux.equals("-")) { //Operación resta.
        		result = resultado.pull();
        		for(int x = 0; x < n; x++) {
        			result -= resultado.pull();
        		}
        		resultado.push(result);
        	}else if(aux.equals("*")) { //Operación multiplicación.
        		result = resultado.pull();
        		for(int x = 0; x < n; x++) {
        			result *= resultado.pull();
        		}
        		resultado.push(result);
        	}else if(aux.equals("/")) { //Operación división.
        		result = resultado.pull();
        		for(int x = 0; x < n; x++) {
        			result /= resultado.pull();
        		}
        		resultado.push(result); //Muestra el resultado.
        	}
		}

	}
		//System.out.println(result);
		
		return Double.toString(resultado.pull()).replace(".0",""); //Valor de retorno con el resultado ya calculado.
	}
}
