package Recursion;

public class Printname {

    public static void printntime(int N,int count,String name ){
        while(count==N)
            return;
            System.out.println(name);
            count++;
            printntime(N,count,name);
        
    }
    public static void main(String[] args) {
        int N=3;
        int count=0;
        String name="Ashish";
        printntime(N,count,name);
    }
}
