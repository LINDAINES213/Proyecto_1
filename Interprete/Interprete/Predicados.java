package Interprete;

public class Predicados {
	public String evaluarPredicado(String codigo) {
		
		String[] s = codigo.split(" ");
		String predicado = "";
		String resultado = "";
		
		if(codigo.contains("atom")){
        	predicado = "atom";
        }else if(codigo.contains("equal")){
        	predicado = "equals";
        }else if(codigo.contains("list")){
        	predicado = "list";
        }else if(codigo.contains("<")){
        	predicado = "menorQue";
        }else if(codigo.contains(">")){
        	predicado = "mayorQue";
        }else {
        	return "NIL"; 
        }
		
		if(predicado.equals("atom")) {
			if(s.length <= 2) {
				resultado = "T";
			}else {
				resultado = "NIL";
			}
		}
		
		if(predicado.equals("equals")) {
			if(s[1].equals(s[2])) {
    			resultado = "T";
    		}else {
    			resultado = "NIL";
    		}
		}else if(predicado.equals("list")) {
			resultado = "(";
    		for(int a = 1; a <= (s.length - 1); a++) {
    			if(a < (s.length - 1)) {
    				resultado += s[a] + ", ";
    			}else {
    				resultado += s[a];
    			}
    		}
    		resultado += ")";
		}else if(predicado.equals("menorQue")) {
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
		}else if(predicado.equals("mayorQue")) {
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
		
		
		return resultado;
	}
}
