package Interprete;

import java.util.HashMap;

public class funcionesLisp {
	
	public StackArrayList<String> cambioVariable(StackArrayList<String> pila){ //Método para cambiar la variable por medio de una pila.
		StackArrayList<String> nuevosValores = new StackArrayList<String>(); //Stack con los nuevos valores.
		String tempKey = "";
		HashMap<String, String> hmap = new HashMap<String, String>();
		

		for(int a = 0; a < pila.count(); a++) { //Ciclo for para los nuevos valores de acuerdo al count de la pila.
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
		HashMap<String, String> hmap = new HashMap<String, String>(); //Adición de hashmap a las funciones.
		if(hmap.containsKey(variable)) {
			hmap.remove(variable);
			hmap.put(variable, valor);
		}else {
			hmap.put(variable, valor);
		}
	}
	
	public boolean buscarLlaves(String key) { //Método para buscar keys en el archivo.
		HashMap<String, String> hmap = new HashMap<String, String>();
		if(hmap.containsKey(key)){
			return true;
		}else {
			return false;
		}
	}
	
	public boolean findVariable(String key) {
		HashMap<String, String> hmap = new HashMap<String, String>();
		if(hmap.containsKey(key)) { //if found
			return true;
		}else {
			return false;
		}
	}
}
