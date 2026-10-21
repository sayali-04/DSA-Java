package Arrays;
public class MissingNumber {

        public static int findmissingNumber(int[] nums) {
        int n = nums.length;
        int total_sum = n * (n + 1) / 2;

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }

        return total_sum - sum;
    }
    public static void main(String[] args) {
        int nums[]={0,2,3,1,4};
        System.out.println(findmissingNumber(nums));
        
    }
}
