package com.ds.queue.linkedlist;

public class QueueUsingLinkedList<T> {
	Node rear;
	Node front;

	public QueueUsingLinkedList() {
		rear = null;
		front = null;
	}

	public void enqueue(T value) {
		Node newNode = new Node(value, null, null);
		if (rear == null) {
			rear = newNode;
			front = newNode;
		} else {
			newNode.prev = rear;
			newNode.next = null;
			rear.next = newNode;
			rear = newNode;
		}
	}

	public T dequeue() throws QueueUnderflowUsingLinkedList {
		if (rear == null || front == null) {
			throw new QueueUnderflowUsingLinkedList("Queue is empty");
		}
		T value = (T) front.value;
		front = front.next;
		if (front != null) {
			front.prev = null;
		}
		return value;
	}

}