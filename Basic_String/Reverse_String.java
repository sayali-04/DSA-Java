package Basic_String;

public class Reverse_String {

    public static void reverseString(String str[]){
        int first=0;int last=str.length-1;
        while(first<last){

            String temp=str[last];
            str[last]=str[first];
            str[first]=temp;

            first++;
            last--;
        }
         for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }

    }
    public static void main(String[] args) {
        String[] str={"h","e","l","l","o"};
        reverseString(str);

    }
}
