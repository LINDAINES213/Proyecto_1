package Interprete;

/**
 * Clase main del intÃ©rprete Lisp del Proyecto.
 * @author Javier Alvarado, Mario Guerra, Linda JimÃ©nez
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
        StackArrayList<Defun> stackFunciones = new StackArrayList<Defun>();
        
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
                String resultado = calculadoraLisp.calcularOperacion(operacion);
                return resultado;
         }else if(p.equals("quote")) {
        	 String cadena = "";
        	 String[] resultadoRp = codigo.replace("(","").replace(")","").split(" ");
        	 for(int i=0; i<resultadoRp.length;i++) {
        		 if(!resultadoRp[i].equals("quote") && i != 0 && i !=resultadoRp.length) {
        			 cadena += resultadoRp[i];
        			 cadena += " ";
        		 }
        	 }
        	 nombreFuncion = cadena;
        	 return ("("+cadena+")");
         }else if(p.equals("defun")) {
        	 String nuevoCodigo = codigo;
        	 
        	 String funcion = "";
        	 if((stack.count() >=5)) {
        		 System.out.println("¡Error!, ha ingresado valores de mas, recuerde que una función lleva (DEFUN + Nombre de la función + (Parametros))");
        	 }else {
        		 for(int i = 3; i<stack.count();i++) {
        			 funcion += stack.get(i);
        			 
        		 }
        		 Defun objFuncion = new Defun(stack.get(1),stack.get(2), funcion, nuevoCodigo);
        		 stackFunciones.push(objFuncion);
        	 }
        	 
        	 //return stackFunciones.peek().nombreFuncion;
        	 return "Se ha creado exitosamente la función de nombre: "+ stackFunciones.peek().nombreFuncion + "\nDigite 'functions' si desea programar su función ";
         
         }else if(p.equals("setq")){
        	 if(stack.count()>3) {
        		 System.out.println("¡SetQ solo acepta una variable y un valor!");
        	 }else {
        		 functions.añadirHashmap(stack.get(1),stack.get(2));
        	 }
        	 
        	 return "Se ha asignado el valor "+ stack.get(2) + " para la variable: "+stack.get(1);
        	 
         }else if(p.equals("atom")) {
        	 String bool = "";
        	 for(int i=0;i<stack.count();i++) {
        		 bool += stack.get(i);
        		 bool += " ";
        	 }
         }
        
        return "";
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
    
    public StackArrayList<String> defun(){
    	StackArrayList<String> function = new StackArrayList<String>();
    	
    	return function;
    }
}
