package Interprete;

import java.util.HashMap;

public class funcionesLisp {
	
	public StackArrayList<String> cambioVariable(StackArrayList<String> pila){
		StackArrayList<String> nuevosValores = new StackArrayList<String>();
		String tempKey = "";
		HashMap<String, String> hmap = new HashMap<String, String>();
		

		for(int a = 0; a < pila.count(); a++) {
			tempKey = pila.get(a); 
			if(hmap.containsKey(tempKey)) {
				nuevosValores.push(hmap.get(tempKey));
			}else {
				nuevosValores.push(tempKey);
			}
		}
		return nuevosValores;
	}
	
	public void anadirHashmap(String variable, String valor) {
		HashMap<String, String> hmap = new HashMap<String, String>();
		if(hmap.containsKey(variable)) {
			hmap.remove(variable);
			hmap.put(variable, valor);
		}else {
			hmap.put(variable, valor);
		}
	}
	
	public boolean buscarLlaves(String key) {
		HashMap<String, String> hmap = new HashMap<String, String>();
		if(hmap.containsKey(key)){
			return true;
		}else {
			return false;
		}
	}
}
