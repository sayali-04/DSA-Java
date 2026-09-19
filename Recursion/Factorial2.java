package Recursion;

// Using recursion
public class Factorial2 {
    public static int printfact(int n){
        if(n==0){
            return 1;
        }
        return n * printfact(n-1);
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(printfact(n));
    }
}
