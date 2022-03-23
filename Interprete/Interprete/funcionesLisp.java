package Interprete;

import java.util.HashMap;

public class funcionesLisp {
	
	public StackArrayList<String> cambioVariable(StackArrayList<String> pila){
		StackArrayList<String> nuevosValores = new StackArrayList<String>();
		String tempKey = "";
		HashMap<String, String> variables = new HashMap<String, String>();
		
		//iterating over the stack
		for(int a = 0; a < pila.count(); a++) {
			tempKey = pila.get(a); //looking for variables
			
			if(variables.containsKey(tempKey)) {//if found variable
				nuevosValores.push(variables.get(tempKey));
			}else {
				nuevosValores.push(tempKey);
			}
		}
		return nuevosValores;
	}
}
