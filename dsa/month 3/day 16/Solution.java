public class Solution {

    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int sum=0;
        int maxSum=Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            maxSum=Math.max(sum,maxSum);
            if(sum<0) sum=0;
        }
        return maxSum;
    }
}
