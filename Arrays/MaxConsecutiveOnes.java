package Arrays;

public class MaxConsecutiveOnes {

    public static int maxconsecutiveones(int nums[]){
        int count=0;
        int maxcount=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=1){
                count=0;
            }
            else if (nums[i]==1){
                count++;
                maxcount=Math.max(count,maxcount);
            }
        }
        return maxcount;
    }
    public static void main(String[] args) {
        int nums[]={1,1,0,0,1,1,1,0};
        System.out.println(maxconsecutiveones(nums));
    }
}
