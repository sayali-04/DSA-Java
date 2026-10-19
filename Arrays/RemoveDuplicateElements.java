package Arrays;
 public class RemoveDuplicateElements{

    public static int removeduplicate(int nums[]){
        int j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[j-1]){
                 nums[j]=nums[i];
                 j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int nums[]={0,0,3,3,5,6};
        System.out.println("Unique elements are :"+removeduplicate(nums));
    }
 }