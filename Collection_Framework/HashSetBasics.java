import java.util.*;

public class HashSetBasics {
    public static void main(String[] args) {
    Set<Integer> set = new HashSet<>();
    Set<Integer> set1=new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(4);

    set1.add(3);
    set1.add(4);
    set1.add(5);
    set1.add(6);

    System.out.println(set);
    set.retainAll(set1);
    System.out.println(set);
    System.out.println(set1);

    System.out.println(set.containsAll(set1));




    







        
//         HashSet <Integer> set=new HashSet<>();
//         //Insert
//         set.add(10);
//         set.add(10);
//         set.add(20);
//         set.add(30);
//         set.add(40);
//         set.add(50);

//         System.out.println(set);

//         System.out.println("Size of set:"+set.size());

//         //search
//         if(set.contains(10)){
//             System.out.println("Set contains 10");
//         }
//         if(!set.contains(6)){
//             System.out.println("Set do not contains ");
//         }

//         //delete
//         set.remove(30);
//         if(!set.contains(30)){
//             System.out.println("Set do not contains 30");
//         }

//         //Iterator
//         Iterator<Integer>it=set.iterator();
//         while (it.hasNext()) {
//             System.out.println(it.next());
            
//         }


     }
 }
