import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        q.offer(10);
        q.offer(30);
        q.offer(50);
        q.offer(70);

        System.out.println(q);

        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.peek());
    }
}
