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
    
   

	public String interpretarCodigo(String codigo) { //Método para interpretar código.
    	String p;
		boolean r = false;
		boolean c = true;
    	String operacion = "";
    	String nombreFuncion = "";
    	Calculator calculadoraLisp = new Calculator();
    	funcionesLisp functions = new funcionesLisp();
    	Predicados predicado = new Predicados();
        StackArrayList<String> stack = new StackArrayList<String>();
        StackArrayList<String> codigoRecursivo = new StackArrayList<String>();
        StackArrayList<String> recursivoR = new StackArrayList<String>();
        StackArrayList<Defun> stackFunciones = new StackArrayList<Defun>();
        String parametro;
        String val;
        String funcionVal;
        String funcionNombre = "";
        //int c = -2;
		int contador = -1;
        
        stack = separarCaracteres(codigo);
        
        if(r && c){ 
			stack = codigoRecursivo; 
		}
        
        if(r && !c) { 
        	int vbls = 0;
			int aux = 0; 
			parametro = getParametro(funcionNombre); 
			val = String.valueOf(contador); 
			stack = pushParametro(stack, parametro, val);
			StackArrayList<String> values = new StackArrayList<String>(); 
			
			for(int i = 0; i < stack.count(); i++) {
				String key = stack.get(i);
				if(key.equals(funcionNombre)) { 
					values.push(recursivoR.get(vbls)); 
					aux = i;
					vbls++;
				}
				if(i != (aux + 1) && i != (aux + 2) && i != (aux + 3) && i != aux) { 
					values.push(key);
				}
			}
			stack = values; 
		}
        p = stack.get(0);

        if(p.equals("+") || p.equals("-") || p.equals("*")||p.equals("/")) { //Condicional if para las direentes operaciones aritméticas.
                stack = functions.cambioVariable(stack);
                for(int i = 0; i < stack.count(); i++){
                    operacion += stack.get(i);
                    operacion += " ";
                }  
                String resultado = calculadoraLisp.calcularOperacion(operacion);
                return resultado;
         }else if(p.equals("quote")) { //Opción para el quote en Lisp.
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
         }else if(p.equals("defun")) { //Opción para la utilización de funciones en Lisp.
        	 String nuevoCodigo = codigo;
        	 
        	 String funcion = "";
        	 if((stack.count() >=4)) {
        		 System.out.println("�Error!, ha ingresado valores de mas, recuerde que una funci�n lleva (DEFUN + Nombre de la funci�n + (Parametros))");

        	 }else {
        		 for(int i = 3; i<stack.count();i++) {
        			 funcion += stack.get(i);
        			 
        		 }
        		 Defun objFuncion = new Defun(stack.get(1),stack.get(2), funcion, nuevoCodigo);
        		 stackFunciones.push(objFuncion);
        	 }
        	 
        	 //return stackFunciones.peek().nombreFuncion;
        	 return "Se ha creado exitosamente la funci�n de nombre: "+ stackFunciones.peek().nombreFuncion;
         
         }else if(p.equals("setq")){ //Opción para utilizar el setq.
        	 if(stack.count()>5) {
        		 System.out.println("�SetQ solo acepta una variable y un valor!");
        	 }else {
        		 functions.anadirHashmap(stack.get(1),stack.get(2));
        	 }
        	 
        	 return "\nSe ha asignado el valor "+ stack.get(2) + " para la variable: "+stack.get(1);
			 
        	 
         }else if (functions.buscarLlaves(p)) {
        	 String cadena = "";
             for(int i = 0; i < stack.count(); i++){
                 cadena += stack.get(i);
                 cadena += " ";   
             }
				return cadena;
         }else if(p.equals("atom")) {  //Opción para utilizar el predicado Atom.
        	 String bool = "";
        	 for(int i=0;i<stack.count();i++) {
        		 bool += stack.get(i);
        		 bool += " ";
        	 }
        	 
        	 return predicado.evaluarPredicado(bool); //Retorna el predicado.
         }else if(p.equals("list")) { //Opción para utilizar el predicado List.
        	 String bool = "";
        	 for(int i=0;i<stack.count();i++) {
        		 bool += stack.get(i);
        		 bool += " ";
        	 }
        	 
        	 return predicado.evaluarPredicado(bool); //Retorna el predicado.
         }else if(p.equals("equal")) { //Opción para utilizar el predicado Equal.
        	 String expresion = "";
        	 if(stack.count() > 3) {
					return "�Error! El metodo Equal solo toma dos argumentos";
				}else if(stack.count() < 3 ) {
					return "�Error! El metodo Equal solo toma dos argumentos";
				}else {
					stack = functions.cambioVariable(stack);
					for(int i = 0; i<stack.count(); i++) {
						expresion += stack.get(i) + " ";
					}
					return predicado.evaluarPredicado(expresion); //Retorna el predicado.
				}
         }else if(p.equals("<")) { //Opción para utilizar el predicado menor que.
        	 String expresion = "";
        	 if(stack.count() > 3) {
					return "�Error! El metodo < solo toma dos argumentos";
				}else if(stack.count() < 3 ) {
					return "�Error! El metodo > solo toma dos argumentos";
				}else {
					stack = functions.cambioVariable(stack);
					
					for(int i = 0; i<stack.count(); i++) {
						expresion += stack.get(i) + " ";
					}
					return predicado.evaluarPredicado(expresion); //Retorna el predicado.
				}
         }else if(p.equals(">")) {
        	 String expresion = "";
        	 if(stack.count() > 3) {
					return "�Error! El metodo > solo toma dos argumentos";
				}else if(stack.count() < 3 ) {
					return "�Error! El metodo > solo toma dos argumentos";
				}else {
					stack = functions.cambioVariable(stack);
					for(int i = 0; i<stack.count(); i++) {
						expresion += stack.get(i) + " ";
					}
					return predicado.evaluarPredicado(expresion);
				}
			}
				
        return "";
	}    

    public StackArrayList<String> separarCaracteres(String codigo) { //Método para separar caracteres de la expresión en la calculadora.
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
    
    public StackArrayList<String> defun(){  //Método para devolver la función defun al programa.
    	StackArrayList<String> function = new StackArrayList<String>();
    	
    	return function;
    }
    
    public String getParametro(String functionName) {
    	StackArrayList<Defun> stackFunciones = new StackArrayList<Defun>();
    	for(int i = 0; i < stackFunciones.count(); i++) {
    		if( functionName.equals(stackFunciones.get(i).getNombreFuncion()) ) {
    			return stackFunciones.get(i).getParametros(); 
    		}
    	}
    	return "null";
    }
    
    public StackArrayList<String> pushParametro(StackArrayList<String> codigo, String parametro, String val) {
    	StackArrayList<String> p = new StackArrayList<String>();
    	for(int a = 0; a < codigo.count(); a++) {
    		String key = codigo.get(a);
    		if( key.equals(parametro) ) { 
    			p.push(val); 
    		}else {
    			p.push(key);
    		}
    	}
    	return p;
    }
}
