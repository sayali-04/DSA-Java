package Recursion;

public class Reverse_array2 {
    public static void reverse_array(int nums[]){
        int first=0; int last=nums.length-1;
        
        while(first<=last){
            int temp=nums[last];
            nums[last]=nums[first];
            nums[first]=temp;
            first++;
            last--;
        }
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        reverse_array(nums);
    }
}
