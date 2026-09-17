package Recursion;

public class Print1toN {
    public static void print1ton(int N,int count){
        if (count>N) 
            return;
        System.out.println(count);
        count++;
        print1ton(N, count);
    }
    public static void main(String[] args) {
        int N=4;
        int count=1;
        print1ton(N, count);
        
    }
}
