/*
 *  Eino Lindberg 2020
 */

public class Lista<T> {
	private T[] values;
	private int size;
	
	public Lista() {
		this.values = (T[]) new Object[10];
		size = 0;
	}
	
	public void add(T obj) {
		if (size == values.length) {
			increase();
		}
		values[size] = obj;
		size++;
	}
	
	private void increase() {
		int newSize = size + size / 2;
		T[] cpy = (T[]) new Object[newSize];
		for (int i = 0; i < size; i++) {
			cpy[i] = values[i];
		}
		values = cpy;
	}
	
	private void decrease() {
		int newSize = size + 1 + values.length / 10;
		T[] cpy = (T[]) new Object[newSize];
		for (int i = 0; i < size; i++) {
			cpy[i] = values[i];
		}
		values = cpy;
	}
	
	public boolean contains(T obj) {
		for (int i = 0; i < size; i++) {
			if (values[i] == obj || values[i].equals(obj)) {
				return true;
			}
		}
		return false;
	}
	
	public void remove(T obj) {
		int index = indexOf(obj);
		if (index < 0) {
			return ;
		}
		moveLeft(index);
		size--;
		if (size < values.length / 2) {
			decrease();
		}
	}
	
	public int indexOf(T obj) {
		for (int i = 0; i < size; i++) {
			if (values[i] == obj || values[i].equals(obj)) {
				return i;
			}
		}
		return -1;
	}
	
	private void moveLeft(int from) {
		for (int i = from; i < size - 1; i++) {
			values[i] = values[i + 1];
		}
	}
	
	public T valueOf(int index) {
		if (index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException("Index " + index + " is not between [0-" + (size - 1) + "]");
		}
		return values[index];
	}
	
	public int size() {
		return size;
	}
}
