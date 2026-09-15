public class ReverseDigit {
    public static void main(String[] args) {
        int number=7789;
        int rev=0;
        while(number>0){
        //     int last_digit=(number%10);
        //     System.out.println(last_digit);
        //     number=number/10;

         int last_digit=(number%10);
         rev=(rev*10)+last_digit;
         number=number/10;
        }
       System.out.println(rev);
        
    }
}
