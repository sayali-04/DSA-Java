public class CheckPalindrome {
    public static void main(String[] args) {
        int n=4554;
        int original=n;
        int rev=0;
        while (n>0) {
            int last_digit=n % 10;
            rev=(rev*10)+last_digit;
            n=n/10;
        }
        if(rev==original){
           System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not palindrome");
        }
    }
}
