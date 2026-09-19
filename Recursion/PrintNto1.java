package Recursion;

public class PrintNto1 {
    public static void printNto1(int N,int i){
        if(i<N)
         return;
        System.out.println(i);
        i--;
        printNto1(N,i);
    }
    public static void main(String[] args) {
        int N=1;
        int i=4;
        printNto1(N,i);
    }
}
