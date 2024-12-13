//********************************************************************
//  ArrayQueue.java       Java Foundations
//
//  Represents an array implementation of a queue. The front of
//  the queue is kept at array index 0.
//********************************************************************

package javafoundations;
import javafoundations.exceptions.*;

public class ArrayQueue<T> implements QueueADT<T>
{
    private final int DEFAULT_CAPACITY = 10;
    private int count;
    private T[] queue;

    //-----------------------------------------------------------------
    //  Creates an empty queue using the default capacity.
    //-----------------------------------------------------------------
    public ArrayQueue()
    {
        count = 0;
        queue = (T[]) (new Object[DEFAULT_CAPACITY]);
    }

    //-----------------------------------------------------------------
    //  Removes the element at the front of this queue and returns a
    //  reference to it. Throws an EmptyCollectionException if the
    //  queue is empty.
    //-----------------------------------------------------------------
    public T dequeue() throws EmptyCollectionException
    {
        if (count == 0)
            throw new EmptyCollectionException ("Dequeue operation failed. "
                + "The queue is empty.");

        T result = queue[0];

        count--;

        // shift the elements to keep the front element at index 0
        for (int index=0; index < count; index++)
            queue[index] = queue[index+1];

        queue[count] = null;

        return result;
    }

    //-----------------------------------------------------------------
    //  The following methods are left as Programming Projects.
    //-----------------------------------------------------------------
    /**
     * Adds element T to the end of the queue (expands queue if necessary)
     * 
     * @param element the element to add
     */
    public void enqueue(T element) {
        if (count == queue.length) {
            expandCapacity();
        }

        queue[count] = element;
        count++;
    }

    /**
     * Helper method expandCapacity to double array size
     */
    private void expandCapacity() {
        T[] newQueue = (T[]) new Object[queue.length * 2];

        for (int i = 0; i < count; i++) {
            newQueue[i] = queue[i];
        }

        queue = newQueue;
    }

    /**
     * @return the first element in the array
     */
    public T first() throws EmptyCollectionException {
        if (count == 0) {
            throw new EmptyCollectionException("Cannot return first. Queue empty.");
        }
        return queue[0];
    }

    /**
     * @return true if queue is empty (count = 0; no elements in queue)
     */
    public boolean isEmpty() {
        return (count == 0);
    }

    /**
     * @return the size of the array (how many elements)
     */
    public int size() {
        return count;
    }

    /**
     * @return a String representation of toString()
     */
    @Override
    public String toString() {
        String s = "Queue: ["; // Could use StringBuilder

        for (int i = 0; i < count; i++) {
            s += queue[i];
            if (i < count - 1) {
                s += ", ";
            }
        }

        s += "]";
        return s;
    }
}