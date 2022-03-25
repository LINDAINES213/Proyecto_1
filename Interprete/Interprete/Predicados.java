package Interprete;

public class Predicados {
	public String evaluarPredicado(String codigo) { //Método para evaluar los predicados de acuerdo al que se utilice.
		
		String[] s = codigo.split(" ");
		String predicado = "";
		String resultado = "";
		
		if(codigo.contains("atom")){ //Si contiene atom lo que escriba el usuario, el predicado es atom.
        	predicado = "atom";
        }else if(codigo.contains("equal")){ //Si contiene equal lo que escriba el usuario, el predicado es equal.
        	predicado = "equals";
        }else if(codigo.contains("list")){ //Si contiene list lo que escriba el usuario, el predicado es list.
        	predicado = "list";
        }else if(codigo.contains("<")){ //Si contiene < lo que escriba el usuario, el predicado es menor que.
        	predicado = "menorQue";
        }else if(codigo.contains(">")){ //Si contiene > lo que escriba el usuario, el predicado es mayor que.
        	predicado = "mayorQue";
        }else {
        	return "NIL"; //No hay predicado si no se escribió alguno de los anteriores predicados.
        }
		
		if(predicado.equals("atom")) { //Devuelve T si hay predicado y devuelve NIL si no lo hay de acuerdo a la correcta utilización del predicado
			if(s.length <= 2) {
				resultado = "T";
			}else {
				resultado = "NIL";
			}
		}
		
		if(predicado.equals("equals")) { //Devuelve T si hay predicado y devuelve NIL si no lo hay de acuerdo a la correcta utilización del predicado
			if(s[1].equals(s[2])) {
    			resultado = "T";
    		}else {
    			resultado = "NIL";
    		}
		}else if(predicado.equals("list")) { //Devuelve T si hay predicado y devuelve NIL si no lo hay de acuerdo a la correcta utilización del predicado
			resultado = "(";
    		for(int a = 1; a <= (s.length - 1); a++) {
    			if(a < (s.length - 1)) {
    				resultado += s[a] + ", ";
    			}else {
    				resultado += s[a];
    			}
    		}
    		resultado += ")";
		}else if(predicado.equals("menorQue")) { //Devuelve T si hay predicado y devuelve NIL si no lo hay de acuerdo a la correcta utilización del predicado
			try {
    			int n1 = Integer.parseInt(s[1]);
                int n2 = Integer.parseInt(s[2]);
                if(n1 < n2) {
                	resultado = "T";
                }else {
                	resultado = "NIL";
                }
    		}catch(Exception e) {
    			return "NIL";
    		}
		}else if(predicado.equals("mayorQue")) { //Devuelve T si hay predicado y devuelve NIL si no lo hay de acuerdo a la correcta utilización del predicado
			try {
				int n1 = Integer.parseInt(s[1]);
				int n2 = Integer.parseInt(s[2]);
				if(n1>n2) {
					resultado = "T";
				}else {
					resultado = "NIL";
				}
			}catch(Exception e) {
				return "NIL";
			}
		}
		
		
		return resultado; //Retorna el valor T o NIL.
	}
}
