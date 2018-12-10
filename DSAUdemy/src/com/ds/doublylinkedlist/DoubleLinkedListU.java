package com.ds.doublylinkedlist;

public class DoubleLinkedListU<T> {
	Node head;

	public DoubleLinkedListU() {
		head = null;
	}

	public void add(Object value) {
		Node newNode = new Node(value, null, null);
		if (head == null)
			head = newNode;
		else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}

	public void delete() {
		head = head.next;
		head.prev = null;
	}

	public void display() {
		Node n = head;
		while (n != null) {
			System.out.println((T) n.value);
			n = n.next;
		}
	}

}