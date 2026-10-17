package Arrays;
public class Left_RotateArray {

    public static void left_rotate(int nums[]){
        int temp=nums[0];
        for(int i=0;i<nums.length-1;i++){
            nums[i]=nums[i+1];
        }
        nums[nums.length-1]=temp;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        left_rotate(nums);

         for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    
}
