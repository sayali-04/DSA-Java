public class countDigitdemo {
    public static void main(String[] args) {
        int number=12345;
        int count=0;
        while(number>0){
            int last_digit=(number%10);
            count++;
            number=number/10;
        }
        System.out.println(count);
    }
}
