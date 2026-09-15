public class GCD_twonumbers {
    public static void main(String[] args) {
        int n1 = 12, n2 = 9, gcd = 1;
        int min = Math.min(n1, n2);

        for(int i = 1; i <= min; i++) {
            if(n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }  
        System.out.println(gcd);
    }
}
