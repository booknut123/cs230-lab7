package javafoundations;

import javafoundations.exceptions.*;

/*
 * A linked implementation of the Queue Interface.
 * */
public class LinkedQueue<T> implements QueueADT<T>
{
    protected LinearNode<T> front;
    protected LinearNode<T> rear;
    protected int count;

    /**
     * Constructor
     * Creates an empty queue.
     */
    public LinkedQueue()
    {
        front = null;
        rear = null;
        count = 0;
    }

    /**
     * Adds the specified element to the rear of the queue
     * @param element the element to add
     */
    public void enqueue (T element) {
        LinearNode<T> newNode = new LinearNode<T>(element);

        if (isEmpty()) {
            front = newNode;  // If the queue is empty, set front to the new node
        } else {
            rear.setNext(newNode);  // Link the current rear to the new node
        }
        rear = newNode;  // Move rear to the new node
        count++;
    }

    /**
     * Removes and returns the element at the front of the queue
     * @return the element at the front of the queue
     */
    public T dequeue() {
        if (isEmpty()) {
            throw new EmptyCollectionException("Dequeue operation failed. The queue is empty.");
        }

        T result = front.getElement();
        front = front.getNext();  // Move front to the next node
        count--;

        // If the queue is now empty, set rear to null
        if (isEmpty()) {
            rear = null;
        }

        return result;
    }

    /**
     * @return a reference to the element at the front of the queue (without removing it)
     */
    public T first() {
        if (isEmpty())
            throw new EmptyCollectionException("Cannot return first. Queue empty.");

        return front.getElement();
    }

    /**
     * @return true if the queue contains no elements
     */
    public boolean isEmpty() {
        return (count == 0);
    }

    /**
     * @return  the number of elements in the queue
     */
    public int size() {
        return count;
    }

    /**
     * @return a string representation of the queue
     */
    public String toString() {
        String s = "Queue: [";
        LinearNode<T> current = front;

        while (current != null) {
            s += current.getElement();
            current = current.getNext();
            if (current != null) {
                s += ", ";
            }
        }
        return s + "]";
    }
}