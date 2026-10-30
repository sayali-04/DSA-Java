package Arrays;

public class Max_SubarraySum {
    /* 
    public static void maxsubaraysum(int nums[]){

        int currsum=0; int maxsum=Integer.MIN_VALUE;
         for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                currsum=0;
                for (int k = i; k <= j; k++) {
                    currsum+=nums[k];
                }
                System.out.println(currsum);
                if(currsum>maxsum){
                  maxsum=currsum;
                }
            }
        }
        System.out.println("Maximum sum:"+maxsum);
    } */

  //Optimized apporach

  public static void kadanes(int nums[]){

    int currsum=0;
    int maxsum=Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++){
        currsum=currsum+nums[i];
        if(currsum<0){
            currsum=0;
        }
        maxsum=Math.max(maxsum, currsum);
    }
    System.out.println(maxsum);
  }

    public static void main(String[] args) {
        int nums[]={-2,-3,4,-1,-2,1,5,-3};
        // maxsubaraysum(nums);
        kadanes(nums);
    }
}
