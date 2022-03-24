package Interprete;

/**
 * Clase main del intérprete Lisp del Proyecto.
 * @author Javier Alvarado, Mario Guerra, Linda Jiménez
 * @see InterpreteLisp
 */

 import java.util.ArrayList;
 import java.util.Stack;
import java.util.function.Function;


public class InterpreteLisp {
    
   

	public String interpretarCodigo(String codigo) {
    	String p;
		boolean r = false;
		boolean conditional = true;
    	String operacion = "";
    	String nombreFuncion = "";
    	Calculator calculadoraLisp = new Calculator();
    	funcionesLisp functions = new funcionesLisp();
        StackArrayList<String> stack = new StackArrayList<String>();
        StackArrayList<String> codigoRecursivo = new StackArrayList<String>();
        
        stack = separarCaracteres(codigo);
        
        if(r && conditional){ //if is recursive and conditional
			stack = codigoRecursivo; 
		}
		
        p = stack.get(0);

            if(p.equals("+") || p.equals("-") || p.equals("*")||p.equals("/")) {
                stack = functions.cambioVariable(stack);
                for(int i = 0; i < stack.count(); i++){
                    operacion += stack.get(i);
                    operacion += " ";
                }
            } 
        
        String resultado = calculadoraLisp.calcularOperacion(operacion);
        //System.out.println(calculadoraLisp.calcularOperacion(operacion));
        return resultado;
    }
	
    public StackArrayList<String> separarCaracteres(String codigo) {
        StackArrayList<String> caracteres = new StackArrayList<String>();

        if (!codigo.contains("(") || !codigo.contains(")")) {
            
        	System.out.println("\nERROR! SE HA OLVIDADO DE COLOCAR PARENTESIS AL CODIGO!");
            return caracteres;
        }
        
        String c = codigo.replace("(", "").replace(")", "");
        for (int i = 0; i < c.split(" ").length; i++) {
        caracteres.push(c.split(" ")[i]);
        }
        
        return caracteres;
    }
}
