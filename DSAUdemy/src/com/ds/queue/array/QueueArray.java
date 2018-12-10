package com.ds.queue.array;

import com.ds.queues.QueueOverflowException;
import com.ds.queues.QueueUnderflowException;

public class QueueArray<T> {

	Object[] queueArray;
	int rear;
	int front;
	int size;

	public QueueArray(int size) {
		this.size = size;
		queueArray = new Object[this.size];
		rear = -1;
		front = -1;
	}

	public Boolean isFull() {
		return (rear == (size - 1));
	}

	public Boolean isEmpty() {
		return ((front == -1) || (front > rear));
	}

	public void enqueue(T newItem) throws QueueOverflowException {
		if (isFull()) {
			throw new QueueOverflowException("Queue is full");
		}
		rear = rear + 1;
		queueArray[rear] = newItem;
		if (front == -1) {
			front = 0;
		}
	}

	public T dequeue() throws QueueUnderflowException {
		if (isEmpty()) {
			throw new QueueUnderflowException("Queue is empty");
		}
		T item = (T) queueArray[front];
		front = front + 1;
		return item;
	}

}