package Interprete;

public class Predicados {
	public String evaluarPredicado(String codigo) {
		
		String[] s = codigo.split(" ");
		String atom = "";
		
		if(codigo.equals("atom")) {
			if(s.length <= 2) {
				atom = "T";
			}else {
				atom = "NIL";
			}
		}
		
		return atom;
	}
}
