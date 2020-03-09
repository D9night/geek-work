package com.geek.work;

/**
 * 循环队列
 *
 * @author Liuxs
 * @version V1.0.0
 * @date 2020-03-09 4:10 PM
 */
public class MyCircularQueue {

    private int[] array;

    private int headIndex, tailIndex;

    private int capacity;

    private int count;

    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularQueue(int k) {
        this.capacity = k;
        array = new int[k];
        headIndex = 0;
        tailIndex = 0;
    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        headIndex = (headIndex - 1 + capacity) % capacity;
        array[headIndex] = value;
        count++;
        return true;
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        array[tailIndex] = value;
        tailIndex = (tailIndex + 1) % capacity;
        count++;
        return true;
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        headIndex = (headIndex + 1) % capacity;
        count--;
        return true;

    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        tailIndex = (tailIndex - 1 + capacity) % capacity;
        count--;
        return true;
    }

    /** Get the front item from the deque. */
    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return array[headIndex];

    }

    /** Get the last item from the deque. */
    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        return array[(tailIndex - 1 + capacity) % capacity];

    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return this.count == 0;
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return this.count == this.capacity;

    }

    public static void main(String[] args) {
        MyCircularQueue obj = new MyCircularQueue(77);

        obj.insertFront(89);
        obj.deleteLast();
        obj.insertFront(19);
        obj.insertFront(23);
        obj.insertFront(23);
        obj.insertFront(82);
        obj.insertFront(45);

        obj.deleteLast();

        obj.insertLast(74);

        obj.deleteFront();

        obj.insertLast(98);
        obj.insertLast(99);
        obj.getRear();
        obj.isFull();
        obj.deleteLast();
        boolean param_5 = obj.isEmpty();
        boolean param_6 = obj.isFull();
    }
}
