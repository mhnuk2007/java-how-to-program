package chapter16.exercises;
/*
16.21 (Changing a PriorityQueue’s Sort Order) The output of Fig. 16.15 shows that
PriorityQueue orders Double elements in ascending order. Rewrite Fig. 16.15 so that
it orders Double elements in descending order (i.e., 9.8 should be the highest-priority
element rather than 3.2).
 */

import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueueTest
{
    public static void main(String[] args)
    {
        // queue with descending order (max-heap)
        PriorityQueue<Double> queue = new PriorityQueue<>(Comparator.reverseOrder());

        // insert elements into queue
        queue.offer(3.2);
        queue.offer(9.8);
        queue.offer(5.4);

        System.out.print("Polling from queue: ");

        // display elements in queue
        while (queue.size() > 0)
        {
            System.out.printf("%.1f ", queue.peek()); // view top element
            queue.poll(); // remove top element
        }
    }
} // end class PriorityQueueTest
