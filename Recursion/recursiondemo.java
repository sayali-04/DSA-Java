package Recursion;
public class recursiondemo {

     static int count=0;
    public static void fun(){
        if(count==3)
         return;
         System.out.println(count);
         count++;
         fun();
    }
    public static void main(String[] args) {
        fun();
    }
}
