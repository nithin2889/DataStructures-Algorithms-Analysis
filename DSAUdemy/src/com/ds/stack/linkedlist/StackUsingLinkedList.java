package com.ds.stack.linkedlist;

import com.ds.stack.StackUnderflowException;

public class StackUsingLinkedList<T> {

	Node top;

	public StackUsingLinkedList() {
		top = null;
	}

	public void push(T value) {
		Node newNode = new Node(value, null);
		if (top == null) {
			top = newNode;
		} else {
			newNode.next = top;
			top = newNode;
		}
	}

	public T pop() {
		if(isEmpty()) {
			throw new StackUnderflowException("Stack is empty");
		}
		T value = (T)top.value;
		top = top.next;
		return value;
	}

	public void display() {
		Node n = top;
		while (n != null) {
			System.out.println((T) n.value);
			n = n.next;
		}
	}
	
	public Boolean isEmpty() {
		return (top == null);
	}

}