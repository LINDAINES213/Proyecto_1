package Interprete;

/**
 * Clase main del intérprete Lisp del Proyecto.
 * @author Javier Alvarado, Mario Guerra, Linda Jiménez
 * @see InterpreteLisp
 */

 import java.util.ArrayList;
 import java.util.Stack;


public class InterpreteLisp {
    
    public String interpretarCodigo(String codigo) {

        StackArrayList<String> stack = new StackArrayList<String>();
        return codigo;
    }

    public StackArrayList<String> separarCaracteres(String codigo) {
        StackArrayList<String> caracteres = new StackArrayList<String>();

        if (!codigo.contains("(")) {
            
        	caracteres.push("Error! Se ha olvidado colocar parentesis al codigo.");
            return caracteres;
        }
        else if(!codigo.contains(")")){
            caracteres.push("Error! Se ha olvidado colocar parent�sis al c�digo");
            return caracteres;
        }
        
        String c = codigo.replace("(", "").replace(")", "");
        for (int i = 0; i < c.split(" ").length; i++) {
        caracteres.push(c.split(" ")[i]);
        }
        
        for (int i = 0; i < caracteres.count(); i++) {
        	System.out.println(caracteres.get(i));
        }


        return caracteres;
    }
}
