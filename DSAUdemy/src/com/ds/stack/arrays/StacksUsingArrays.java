package com.ds.stack.arrays;

import com.ds.stack.StackOverflowException;
import com.ds.stack.StackUnderflowException;

public class StacksUsingArrays<T> {

	Object[] arrayStack;
	int size;
	int top;

	public StacksUsingArrays(int size) {
		this.size = size;
		arrayStack = new Object[this.size];
		top = -1;
	}

	public void push(T newItem) {
		if (isFull()) {
			throw new StackOverflowException("Stack is not empty anymore.");
		}
		top = top + 1;
		arrayStack[top] = newItem;
	}

	public Object pop() {
		if (isEmpty()) {
			throw new StackUnderflowException("Stack is empty.");
		}
		T item = (T) arrayStack[top];
		top = top - 1;
		return item;
	}

	public Boolean isFull() {
		return (top == (size - 1));
	}

	public Boolean isEmpty() {
		return (top == -1);
	}

}