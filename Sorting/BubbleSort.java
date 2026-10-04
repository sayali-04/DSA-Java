package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static int[] bubblesort(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){

                int temp=nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=temp;
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int nums[]={7,4,1,5,3};
        System.out.println(Arrays.toString(bubblesort(nums)));

    }
}
