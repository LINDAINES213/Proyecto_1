package Interprete;

public class Cond {
	   public void CondVerdadero(String c) {
	    	int right = 0;
			int left = 0;
	    	String[] T = new String[5];
	    	String k = "";
	    	String NC = "(";
	    	StackArrayList<String> template = new StackArrayList<String>();
	    	T = c.replace("(", "( ").replace(")"," )").split(" ");
	    	for(int i=0;i<template.count();i++) {
	    		k = template.get(i);
	    		if(k.equals("(")) {
	    			left++;
	    		}else {
	    			right++;
	    		}
	    		
	    		if(left == 5 && right != 5 && (k.equals("(") == false) && (k.equals(")") == false)){
	    			NC += k;
	    			NC += " ";
	    		}
	    	}
	    }
	   
	   public void CondFalso(String c) {
		    int right = 0;
			int left = 0;
	    	String[] T = new String[5];
	    	String k = "";
	    	String NC = "(";
	    	StackArrayList<String> template = new StackArrayList<String>();
	    	T = c.replace("(", "( ").replace(")"," )").split(" ");
	    	
	    	for(int i=0;i<T.length;i++) {
	    		template.push(T[i]);
	    	}
	    	
	    	for(int i=0;i<template.count();i++) {
	    		k = template.get(i);
	    		if(k.equals("(")) {
	    			left++;
	    		}else {
	    			right++;
	    		}
	    		
	    		if(left >= 6 && right != 6 && (k.equals("(") == false) && (k.equals(")") == false)){
	    			NC += k;
	    			NC += " ";
	    		}
	    	}
	   }
	   
	   public String obtenerDefinicionCodigo(StackArrayList<Defun> fun, String nombre) {
		   for(int i=0;i<fun.count();i++) {
			   if(nombre.equals(fun.get(i).getNombreFuncion())) {
				   return fun.get(i).getCodigoFuncion();
			   }
		   }
		   return "NIL";
	   }
}
