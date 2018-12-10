package com.ds.queue.dynamicarray;

import java.util.Arrays;

import com.ds.queues.QueueOverflowException;
import com.ds.queues.QueueUnderflowException;

public class QueueUsingDynamicArray<T> {

	Object[] queueArray;
	int rear;
	int front;
	int size;

	public QueueUsingDynamicArray(int size) {
		this.size = size;
		queueArray = new Object[this.size];
		rear = -1;
		front = -1;
	}

	public void enqueue(T newItem) throws QueueOverflowException {
		ensureCapacity(rear + 2);
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

	public Boolean isFull() {
		return (rear == (size - 1));
	}

	public Boolean isEmpty() {
		return ((front == -1) || (front > rear));
	}

	public void ensureCapacity(int minCapacity) {
		int oldCapacity = getSize();

		if (oldCapacity < minCapacity) {
			int newCapacity = oldCapacity * 2;
			if (newCapacity < minCapacity) {
				newCapacity = minCapacity;
			}
			queueArray = Arrays.copyOf(queueArray, newCapacity);
		}
	}

	private int getSize() {
		return queueArray.length;
	}

}