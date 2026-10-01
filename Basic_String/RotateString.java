package Basic_String;

public class RotateString {

    public static boolean rotate_string(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        for(int i=0; i<str1.length();i++){
            if(str1.equals(str2)){
                return true;
            }else{
                str1 = str1.substring(1) + str1.charAt(0);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str1="abcde";
        String str2="cdeab";

        System.out.println(rotate_string(str1, str2));
    }
}
