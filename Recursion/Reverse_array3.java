package Recursion;
import java.util.*;
public class Reverse_array3 {
        public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Collections.reverse(list);
        
        for(int value:list){
            System.out.println(value);
        }
    }
}
