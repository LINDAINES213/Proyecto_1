package Interprete;

/**
 * Clase StackArrayList.
 * @author Javier Alvarado, Mario Guerra, Linda Jiménez
 * @see StackArrayList
 */

import java.util.ArrayList;


public class StackArrayList<T> implements IStack<T> {
    
	private ArrayList<T> lista;
	
	public StackArrayList() {
	    lista = new ArrayList<T>();
	}
	
	@Override
	public void push(T value) {		
		lista.add(value);
	}

	@Override
	public T pull() {
		return lista.remove(count() - 1);
	}

	@Override
	public T peek() {
		return lista.get(lista.size() - 1);
	}

	@Override
	public int count() {
		return lista.size();
	}

	@Override
	public boolean isEmpty() {		
		return lista.isEmpty();
	}

    @Override
    public T get(int a) {
        return lista.get(a);
    }
    
    @Override
	public void remove(int a) {
		lista.remove(a);
	}
    
    @Override
    public boolean isInStack(String value) {
		for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).equals(value)){
                return true;
            }
        }
        return false;
	}
}
