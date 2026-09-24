package Basic_String;

public class LargestOddNumber {

    public static String printlargestodd(String str){
        //step1:start with last digit
        int i=str.length()-1;
        while(i>=0 &&(str.charAt(i)-'0')%2==0){
            i--;
        }
        //step-2:if no odd digit found
        if(i==-1){
            return "";
        }
        //Step 3: Remove leading zero
          int start = 0;

        while (start < i + 1 && str.charAt(start) == '0') {
            start++;
        }

        return str.substring(start, i + 1);
    }
    public static void main(String[] args) {
        String str="0214638";
        System.out.println(printlargestodd(str));
    }
}
