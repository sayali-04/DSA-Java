package Recursion;

public class Reverse_array {
    public static void reverse_arr(int nums[]){
        int temp[]=new int [nums.length];
         
        int j=0;
        for(int i=nums.length-1;i>=0;i--){
            temp[j]=nums[i];
            j++;
        }
        for(int i=0;i<nums.length;i++){
            System.out.println(temp[i]);
        }
    }
    public static void main(String[] args) {
        int nums[]={5,4,3,2,1};
        int n=5;
       reverse_arr(nums);
    }
    
}
