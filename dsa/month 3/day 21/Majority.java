//Moore vote algorithm 
public class Majority{
    public static void main(String[] args) {
        int[] nums={5,5,5,2,2};
        int candidate=0;
        int count=0;

        for(int i=0;i<nums.length;i++){

            if(count==0){
                candidate=nums[i];
                count=1;
                continue;
            }
            if(nums[i]!=candidate){
                count--;
            }else{
                count++;
            }

        }

        System.out.println(candidate);
    }
}
