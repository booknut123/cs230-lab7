package javafoundations;

import javafoundations.exceptions.*;
import java.util.Random;


/**
 * RandomQueue.java
 * 
 * RandomQueue should be a subclass of LinkedQueue, meaning the keyword is "extends".
 * Therefore it should also be in the javafoundations package.
 * dequeueRandom() is most similar to dequeue except instead of automatically dequeueing the first, it removes a random element. The same exception (empty collection) should be checked.
 * Not much other than dequeueRandom() needs to be tested (although extra testing ensures the subclass was properly implemented).
 * 
 * @author Kailyn Lau
 * @version v1.0
 */
public class RandomQueue<T> extends LinkedQueue<T> implements QueueADT<T> {
    private Random generator;

    public RandomQueue() {
        super(); // LinkedQueue
        generator = new Random();
    }

    /**
     * Removes an element from a random position in the queue
     * Throws an EmptyCollectionException if the queue is empty
     * 
     * @return a random element that will be removed from the queue
     */
    public T dequeueRandom() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Random dequeue operation failed. The queue is empty.");
        }

        int randomIndex = generator.nextInt(size()); // Get a random index based on the size
        if (randomIndex == 0) {
            return dequeue(); // If the random index is 0, just dequeue from the front
        }

        LinearNode<T> current = front;
        for (int i = 0; i < randomIndex - 1; i++) {
            current = current.getNext();
        }

        T result = current.getNext().getElement();
        current.setNext(current.getNext().getNext());

        // Update rear if the last element was removed
        if (current.getNext() == null) {
            rear = current;
        }

        count--;
        return result;
    }
}