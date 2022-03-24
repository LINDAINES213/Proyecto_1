package Interprete;

import java.util.HashMap;

public class funcionesLisp {
	
	public StackArrayList<String> cambioVariable(StackArrayList<String> pila){
		StackArrayList<String> nuevosValores = new StackArrayList<String>();
		String tempKey = "";
		HashMap<String, String> hmap = new HashMap<String, String>();
		
		//iterating over the stack
		for(int a = 0; a < pila.count(); a++) {
			tempKey = pila.get(a); //looking for variables
			
			if(hmap.containsKey(tempKey)) {//if found variable
				nuevosValores.push(hmap.get(tempKey));
			}else {
				nuevosValores.push(tempKey);
			}
		}
		return nuevosValores;
	}
	
	public void añadirHashmap(String variable, String valor) {
		HashMap<String, String> hmap = new HashMap<String, String>();
		if(hmap.containsKey(variable)) {
			hmap.remove(variable);
			hmap.put(variable, valor);
		}else {
			hmap.put(variable, valor);
		}
	}
}
