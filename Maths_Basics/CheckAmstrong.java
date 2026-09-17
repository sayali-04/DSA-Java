public class CheckAmstrong {
    public static void main(String[] args) {
        int n=153;
        int original=n;
        double sum=0;
        while (n>0) 
        {
        double last_digit=n%10;
        // sum=(last_digit*last_digit*last_digit) +sum;
        sum = Math.pow(last_digit, 3) + sum;
        n=n/10;
        }

        if(sum==original){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is palindrome");
        }
    }
}
