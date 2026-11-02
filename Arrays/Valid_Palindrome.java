package Arrays;
public class Valid_Palindrome {
   /*  public static boolean isPalindrome(String str){

        String rev="";

        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        if(!str.equals(rev)){
            return false;
        }
        return true;
    } */

    //Optimized apporach

    public static boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;

        while(left<right){
         if(str.charAt(left)==str.charAt(right)){
          left++;
          right--;
         }
         else{
            return false;
         }

        }
        return true;

    }
    public static void main(String[] args) {
        String str="madam";
        // System.out.println(isPalindrome(str));

        System.out.println(isPalindrome(str));
    }
}
