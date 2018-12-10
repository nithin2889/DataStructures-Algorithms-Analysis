package com.ds.hashtable;

public class HashTableArray<T> {

	Entry[] arrayHash;
	int size;
	
	public HashTableArray(int size) {
		this.size = size;
		arrayHash = new Entry[size];
		for(int i=0; i<size; i++) {
			arrayHash[i] = new Entry();
		}
	}
	
	public int getHash(int key) {
		return key%size;
	}
	
	public void put(int key, Object value) {
		int hashIndex = getHash(key);
		Entry arrayValue = arrayHash[hashIndex];
		Entry newEntry = new Entry();
		newEntry.next = arrayValue.next;
		arrayValue.next = newEntry;
	}
	
	public T get(int key) {
		T value = null;
		int hashIndex = getHash(key);
		Entry arrayValue = arrayHash[hashIndex];
		
		while(arrayValue != null) {
			if(arrayValue.key == key) {
				value = (T)arrayValue.value;
				break;
			}
		}
		return value;
	}

}
