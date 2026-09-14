import java.util.*;

public class HashMapBasics {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("India",120 );
        map.put("US",30 );
        map.put("China",150 );

        // System.out.println(map);
        map.put("China", 110);
        System.out.println(map);

        // if(map.containsKey("China")){
        //     System.out.println("key is present in map");
        // }
        // else{
        //     System.out.println("key not exist");
        // }

        // System.out.println( map.get("India"));

        //Iteration

        // int arr[]={10,20,30};
        // for(int i=0;i<3;i++){
        //     System.out.println(arr[i]);
        // }

        // for(int val:arr){
        //     System.out.println(val);
        // }

        //iteration
        //for(int val:arr)
        // for(Map.Entry<String,Integer> e:map.entrySet()){
        //     System.out.println(e.getKey());
        //     System.out.println(e.getValue());

        // }
        // map.remove("China");
        // System.out.println(map);

    }
}
