package Interprete;

/**
 * Clase main del intérprete Lisp del Proyecto.
 * @author Javier Alvarado, Mario Guerra, Linda Jiménez
 * @see Proyecto01Main
 */

import java.util.Scanner;

public class Proyecto01Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int opcion = 0;
        String codigo = "";
        boolean salir = false;

        System.out.println("Interprete Lisp");
        System.out.println("Bienvenido al interprete Lisp, este es un lenguaje basado en el uso de operaciones Postfix con el objetivo de trabajar en listas.\n");
        System.out.println("Por favor, digite el codigo Postfix que desea operar: ");
        
        while (salir != true) {
            System.out.print("Lisp > ");
            do {
                codigo = scan.next();
            } while (codigo.length() <= 0);
        }
    }
}