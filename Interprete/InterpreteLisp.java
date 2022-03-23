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

        if ((!codigo.contains("(")) || (!codigo.contains(")"))) {
            String c = codigo.replace("(", "").replace(")", "");
            for (int i = 0; i < c.split(" ").length; i++) {
            caracteres.push(c.split(" ")[i]);
            }
            return caracteres;
        }
        else {
            System.out.println("Error! Se ha olvidado colocar parentesis al codigo.");
        }
        for (int i = 0; i < caracteres.count(); i++) {
            System.out.println(caracteres.get(i));
        }

        return caracteres;
    }
}
