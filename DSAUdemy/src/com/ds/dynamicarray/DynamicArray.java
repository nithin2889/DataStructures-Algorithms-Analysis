package com.ds.dynamicarray;

import java.util.Arrays;

public class DynamicArray<T> {

	Object[] data;
	int size;

	public DynamicArray() {
		size = 0;
		data = new Object[1];
	}

	public int getSize() {
		return data.length;
	}

	public T get(int index) {
		return (T) data[index];
	}

	public void put(Object t) {
		ensureCapacity(size + 1);
	}

	private void ensureCapacity(int minCapacity) {
		int oldCapacity = getSize();
		if (minCapacity > oldCapacity) {
			int newCapacity = oldCapacity * 2;
			if (newCapacity < minCapacity)
				newCapacity = minCapacity;
			data = Arrays.copyOf(data, newCapacity);
		}
	}

}