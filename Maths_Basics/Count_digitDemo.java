public class Count_digitDemo {
    public static void main(String[] args) {
       int count=0;
       int number=12345;
       while(number>0){
        number=number/10;
        count++;
       }
       System.out.println("Number of Digits in N: " + count);
    }
}
