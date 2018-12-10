package com.ds.stack.dynamicarray;

import java.util.Arrays;

import com.ds.stack.StackOverflowException;
import com.ds.stack.StackUnderflowException;

public class StacksUsingDynamicArray<T> {

	Object[] arrayStack;
	int size;
	int top;

	public StacksUsingDynamicArray(int size) {
		this.size = size;
		arrayStack = new Object[this.size];
		top = -1;
	}

	public void push(T newItem) {
		ensureCapacity(top + 2);
		top = top + 1;
		arrayStack[top] = newItem;
	}

	public T pop() {
		if (isEmpty()) {
			throw new StackUnderflowException("Stack is empty.");
		}
		T item = (T) arrayStack[top];
		top = top - 1;
		return item;
	}

	public void ensureCapacity(int minCapacity) {
		int oldCapacity = getSize();
		if (minCapacity > oldCapacity) {
			int newCapacity = oldCapacity * 2;
			if (newCapacity < minCapacity) {
				newCapacity = minCapacity;
			}
			arrayStack = Arrays.copyOf(arrayStack, newCapacity);
		}
	}

	public Boolean isFull() {
		return (top == (size - 1));
	}

	public Boolean isEmpty() {
		return (top == -1);
	}

	public int getSize() {
		return arrayStack.length;
	}

}