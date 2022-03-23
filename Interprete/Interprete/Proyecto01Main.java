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
        boolean salir = false;
        InterpreteLisp Interprete = new InterpreteLisp();

        System.out.println("                                                                                                                                                                                                                                                                            \r\n"
        		+ "IIIIIIIIII                           tttt                                                                                                                       tttt                                   LLLLLLLLLLL               iiii                                       \r\n"
        		+ "I::::::::I                        ttt:::t                                                                                                                    ttt:::t                                   L:::::::::L              i::::i                                      \r\n"
        		+ "I::::::::I                        t:::::t                                                                                                                    t:::::t                                   L:::::::::L               iiii                                       \r\n"
        		+ "II::::::II                        t:::::t                                                                                                                    t:::::t                                   LL:::::::LL                                                          \r\n"
        		+ "  I::::I  nnnn  nnnnnnnn    ttttttt:::::ttttttt        eeeeeeeeeeee    rrrrr   rrrrrrrrr   ppppp   ppppppppp   rrrrr   rrrrrrrrr       eeeeeeeeeeee    ttttttt:::::ttttttt        eeeeeeeeeeee           L:::::L               iiiiiii     ssssssssss   ppppp   ppppppppp   \r\n"
        		+ "  I::::I  n:::nn::::::::nn  t:::::::::::::::::t      ee::::::::::::ee  r::::rrr:::::::::r  p::::ppp:::::::::p  r::::rrr:::::::::r    ee::::::::::::ee  t:::::::::::::::::t      ee::::::::::::ee         L:::::L               i:::::i   ss::::::::::s  p::::ppp:::::::::p  \r\n"
        		+ "  I::::I  n::::::::::::::nn t:::::::::::::::::t     e::::::eeeee:::::eer:::::::::::::::::r p:::::::::::::::::p r:::::::::::::::::r  e::::::eeeee:::::eet:::::::::::::::::t     e::::::eeeee:::::ee       L:::::L                i::::i ss:::::::::::::s p:::::::::::::::::p \r\n"
        		+ "  I::::I  nn:::::::::::::::ntttttt:::::::tttttt    e::::::e     e:::::err::::::rrrrr::::::rpp::::::ppppp::::::prr::::::rrrrr::::::re::::::e     e:::::etttttt:::::::tttttt    e::::::e     e:::::e       L:::::L                i::::i s::::::ssss:::::spp::::::ppppp::::::p\r\n"
        		+ "  I::::I    n:::::nnnn:::::n      t:::::t          e:::::::eeeee::::::e r:::::r     r:::::r p:::::p     p:::::p r:::::r     r:::::re:::::::eeeee::::::e      t:::::t          e:::::::eeeee::::::e       L:::::L                i::::i  s:::::s  ssssss  p:::::p     p:::::p\r\n"
        		+ "  I::::I    n::::n    n::::n      t:::::t          e:::::::::::::::::e  r:::::r     rrrrrrr p:::::p     p:::::p r:::::r     rrrrrrre:::::::::::::::::e       t:::::t          e:::::::::::::::::e        L:::::L                i::::i    s::::::s       p:::::p     p:::::p\r\n"
        		+ "  I::::I    n::::n    n::::n      t:::::t          e::::::eeeeeeeeeee   r:::::r             p:::::p     p:::::p r:::::r            e::::::eeeeeeeeeee        t:::::t          e::::::eeeeeeeeeee         L:::::L                i::::i       s::::::s    p:::::p     p:::::p\r\n"
        		+ "  I::::I    n::::n    n::::n      t:::::t    tttttte:::::::e            r:::::r             p:::::p    p::::::p r:::::r            e:::::::e                 t:::::t    tttttte:::::::e                  L:::::L         LLLLLL i::::i ssssss   s:::::s  p:::::p    p::::::p\r\n"
        		+ "II::::::II  n::::n    n::::n      t::::::tttt:::::te::::::::e           r:::::r             p:::::ppppp:::::::p r:::::r            e::::::::e                t::::::tttt:::::te::::::::e               LL:::::::LLLLLLLLL:::::Li::::::is:::::ssss::::::s p:::::ppppp:::::::p\r\n"
        		+ "I::::::::I  n::::n    n::::n      tt::::::::::::::t e::::::::eeeeeeee   r:::::r             p::::::::::::::::p  r:::::r             e::::::::eeeeeeee        tt::::::::::::::t e::::::::eeeeeeee       L::::::::::::::::::::::Li::::::is::::::::::::::s  p::::::::::::::::p \r\n"
        		+ "I::::::::I  n::::n    n::::n        tt:::::::::::tt  ee:::::::::::::e   r:::::r             p::::::::::::::pp   r:::::r              ee:::::::::::::e          tt:::::::::::tt  ee:::::::::::::e       L::::::::::::::::::::::Li::::::i s:::::::::::ss   p::::::::::::::pp  \r\n"
        		+ "IIIIIIIIII  nnnnnn    nnnnnn          ttttttttttt      eeeeeeeeeeeeee   rrrrrrr             p::::::pppppppp     rrrrrrr                eeeeeeeeeeeeee            ttttttttttt      eeeeeeeeeeeeee       LLLLLLLLLLLLLLLLLLLLLLLLiiiiiiii  sssssssssss     p::::::pppppppp    \r\n"
        		+ "                                                                                            p:::::p                                                                                                                                                      p:::::p            \r\n"
        		+ "                                                                                            p:::::p                                                                                                                                                      p:::::p            \r\n"
        		+ "                                                                                           p:::::::p                                                                                                                                                    p:::::::p           \r\n"
        		+ "                                                                                           p:::::::p                                                                                                                                                    p:::::::p           \r\n"
        		+ "                                                                                           p:::::::p                                                                                                                                                    p:::::::p           \r\n"
        		+ "                                                                                           ppppppppp                                                                                                                                                    ppppppppp         ");
        
        System.out.println("Bienvenido al interprete Lisp, este es un lenguaje basado en el uso de operaciones Postfix con el objetivo de trabajar en listas.\n");
        System.out.println("Por favor, digite el codigo Lisp que desea operar: ");
        
        while (salir != true) {
        	String codigo = "";
            System.out.print("Lisp > ");
            do {
                codigo = scan.nextLine();
            } while (codigo.length() <= 0);
            Interprete.separarCaracteres(codigo);
            
            
        }
    }
}