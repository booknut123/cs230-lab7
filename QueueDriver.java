import javafoundations.*;
import javafoundations.exceptions.*;

/**
 * Driver to test ArrayQueue, LinkedQueue, and RandomQueue
 *
 * @author Kailyn Lau
 * @version v1.0
 */
public class QueueDriver
{
    public static void main(String[] args) {
        System.out.println("Testing ArrayQueue:");
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();

        for (int i = 1; i <= 5; i++) { // enqueue
            arrayQueue.enqueue(i);
            System.out.println("Enqueued: " + i);
        }
        System.out.println("ArrayQueue after enqueues: " + arrayQueue);

        try {
            System.out.println("First: " + arrayQueue.first()); // testing first()
        } catch (EmptyCollectionException e) {
            e.printStackTrace();
        }

        try {
            for (int i = 1; i <= 5; i++) { // dequeue
                int dequeued = arrayQueue.dequeue();
                System.out.println("Dequeued: " + dequeued);
            }
        } catch (EmptyCollectionException e) {
            e.printStackTrace();
        }

        System.out.println("Final ArrayQueue state: " + arrayQueue);

        // Test LinkedQueue
        System.out.println("\nTesting LinkedQueue...");
        LinkedQueue<String> linkedQueue = new LinkedQueue<>();

        // Enqueue elements
        linkedQueue.enqueue("A");
        linkedQueue.enqueue("B");
        linkedQueue.enqueue("C");
        System.out.println("LinkedQueue after enqueues: " + linkedQueue);

        // Test first
        try {
            System.out.println("First: " + linkedQueue.first()); // testing first()
        } catch (EmptyCollectionException e) {
            e.printStackTrace();
        }

        try {
            for (int i = 0; i < 3; i++) { // dequeue
                String dequeued = linkedQueue.dequeue();
                System.out.println("Dequeued: " + dequeued);
            }
        } catch (EmptyCollectionException e) {
            e.printStackTrace();
        }

        System.out.println("Final LinkedQueue state: " + linkedQueue);

        // Test RandomQueue
        System.out.println("\nTesting RandomQueue...");
        RandomQueue<Double> randomQueue = new RandomQueue<>();

        for (double i = 1.0; i <= 5.0; i++) { // enqueue
            randomQueue.enqueue(i);
            System.out.println("Enqueued: " + i);
        }
        System.out.println("RandomQueue after enqueues: " + randomQueue);

        try {
            System.out.println("First: " + randomQueue.first()); // testing first()
        } catch (EmptyCollectionException e) {
            e.printStackTrace();
        }

        try {
            for (int i = 0; i < 3; i++) { // random dequeue
                double dequeued = randomQueue.dequeueRandom();
                System.out.println("Randomly Dequeued: " + dequeued);
            }
        } catch (EmptyCollectionException e) {
            e.printStackTrace();
        }

        System.out.println("Final RandomQueue state: " + randomQueue);
    }
}

