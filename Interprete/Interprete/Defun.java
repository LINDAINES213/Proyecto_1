package Interprete;

public class Defun {
	
	String nombreFuncion;
	String parametros;
	String codigoFuncion;
	String codigoNuevo;
	
	public Defun(String nombreFuncion, String parametros, String codigoFuncion, String codigoNuevo) {  //Método para las funciones en Lisp.
		this.nombreFuncion = nombreFuncion;
		this.parametros = parametros;
		this.codigoFuncion = codigoFuncion;
		this.codigoNuevo = codigoNuevo;
	}

	/**
	 * @return the nombreFuncion
	 */
	public String getNombreFuncion() {  //Método para obtener el nombre de la función.
		return nombreFuncion;
	}

	/**
	 * @param nombreFuncion the nombreFuncion to set
	 */
	public void setNombreFuncion(String nombreFuncion) {  //Método para colocar el nombre de la función.
		this.nombreFuncion = nombreFuncion;
	}

	/**
	 * @return the parametros
	 */
	public String getParametros() {  //Método para obtener los parámetros.
		return parametros;
	}

	/**
	 * @param parametros the parametros to set
	 */
	public void setParametros(String parametros) { //Método para colocar los parámetros.
		this.parametros = parametros;
	}

	/**
	 * @return the codigoFuncion
	 */
	public String getCodigoFuncion() { //Método para obtener el código de funcionamiento.
		return codigoFuncion;
	}

	/**
	 * @param codigoFuncion the codigoFuncion to set
	 */
	public void setCodigoFuncion(String codigoFuncion) { //Método para obtener el código de funcionamiento.
		this.codigoFuncion = codigoFuncion;
	}
	
	
	
}
