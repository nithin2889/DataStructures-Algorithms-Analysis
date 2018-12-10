package com.ds.doublylinkedlist;

public class Node {

	Object value;
	Node next;
	Node prev;

	public Node(Object value, Node next, Node prev) {
		this.value = value;
		this.next = next;
		this.prev = prev;
	}

}