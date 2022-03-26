package Interprete;
/**
 * Clase interfaz Stack.
 * @author Javier Alvarado, Mario Guerra, Linda Jiménez
 */
public interface IStack<T> {

	void push(T value);
	
	T pull();
	
	T peek();
	
	int count();
	
	boolean isEmpty();

    T get(int a);

	boolean isInStack(String value);

	void remove(int a);

}
