package Arrays;

public class SecondLargest {

    public static int findsecondlargest(int nums[]){
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                secondlargest=largest;
                largest=nums[i];
            }
            else if(nums[i]>secondlargest && nums[i]!=largest){
                secondlargest=nums[i];
            }
        }
        return secondlargest;
    }
    
    public static void main(String[] args) {
        int nums[]={8,8,7,6,5};

        System.out.println(findsecondlargest(nums));
    }
}
