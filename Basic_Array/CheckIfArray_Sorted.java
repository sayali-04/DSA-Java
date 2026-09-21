package Basic_Array;

public class CheckIfArray_Sorted {

    public static boolean ifarray_sorted(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};

        System.out.println(ifarray_sorted(nums));
    }
    
}
