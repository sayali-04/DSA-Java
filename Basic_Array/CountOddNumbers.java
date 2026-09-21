package Basic_Array;

public class CountOddNumbers {

    public static int countoddnumbers(int nums[]){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
               count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        System.out.println(countoddnumbers(nums));
    }
}
