import java.util.*;
public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer>list =new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(6);
        list.add(1);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(0));
        list.set(1,20);
         System.out.println(list);
         System.out.println(list.contains(10));
         
         Iterator<Integer>it=list.iterator();
         while(it.hasNext()){
            System.out.println(it.next());
         }

         list.remove(3);
          System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

     ArrayList<Integer> newlist = (ArrayList<Integer>) list.clone();
     System.out.println(newlist);


    
    }
}
