package greedy;
import java.util.Collections;
import java.util.PriorityQueue;
public class MaxHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new
                PriorityQueue<>(Collections.reverseOrder());
        // 2 8 9 6 4 1 5 10
        maxHeap.offer(2);
        maxHeap.offer(8);
        maxHeap.offer(9);
        maxHeap.offer(6);
        maxHeap.offer(4);
        maxHeap.offer(1);
        maxHeap.offer(5);
        maxHeap.offer(10);
        System.out.println(maxHeap);
        System.out.println(maxHeap.peek());

    }
}
