import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ArrayQueBasics {
    public static void main(String[] args) {
    
    Deque<Integer> q=new ArrayDeque<>();
    q.offer(10);
    q.offer(40);
    q.offer(30);
    q.offerLast(50);
    q.offerFirst(20);

    System.out.println(q);

    System.out.println(q.pollFirst());
    System.out.println(q.peekFirst());

    
    }
}
