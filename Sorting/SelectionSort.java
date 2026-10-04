package Sorting;

import java.sql.Array;
import java.util.Arrays;

public class SelectionSort {

    public static int[] selection_sort(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            int smallindex=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[smallindex]){
                    smallindex=j;
                }
            }
              int temp=nums[i];
                nums[i]=nums[smallindex];
                nums[smallindex]=temp;
        }
        return nums;
    }
    public static void main(String[] args) {
        int nums[]={7,4,1,5,3};
       System.out.println(Arrays.toString(selection_sort(nums)));
    }
}
