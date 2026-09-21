package Basic_Array;

public class SumOfElements {

    public static int sumofelements(int nums[]){
        int sum=0;
        for(int i=0; i<nums.length;i++){
            sum=sum+nums[i];
        }
        return sum;
        
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        System.out.println(sumofelements(nums));
    }
}
