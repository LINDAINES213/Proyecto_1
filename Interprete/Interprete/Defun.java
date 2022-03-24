package Interprete;

public class Defun {
	
	String nombreFuncion;
	String parametros;
	String codigoFuncion;
	String codigoNuevo;
	
	public Defun(String nombreFuncion, String parametros, String codigoFuncion, String codigoNuevo) {
		this.nombreFuncion = nombreFuncion;
		this.parametros = parametros;
		this.codigoFuncion = codigoFuncion;
		this.codigoNuevo = codigoNuevo;
	}

	/**
	 * @return the nombreFuncion
	 */
	public String getNombreFuncion() {
		return nombreFuncion;
	}

	/**
	 * @param nombreFuncion the nombreFuncion to set
	 */
	public void setNombreFuncion(String nombreFuncion) {
		this.nombreFuncion = nombreFuncion;
	}

	/**
	 * @return the parametros
	 */
	public String getParametros() {
		return parametros;
	}

	/**
	 * @param parametros the parametros to set
	 */
	public void setParametros(String parametros) {
		this.parametros = parametros;
	}

	/**
	 * @return the codigoFuncion
	 */
	public String getCodigoFuncion() {
		return codigoFuncion;
	}

	/**
	 * @param codigoFuncion the codigoFuncion to set
	 */
	public void setCodigoFuncion(String codigoFuncion) {
		this.codigoFuncion = codigoFuncion;
	}
	
	
	
}
