import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueBasics {
    public static void main(String[] args) {

//Default behaviour->Integers case->low value->High priority->MinHeap
//using comparatos->Integer->High value->High priority->MaxHeap

        Queue<Integer> pq=new PriorityQueue<>();
        pq.offer(20);
        pq.offer(10);
        pq.offer(30);
        pq.offer(40);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.peek());

    }
}
