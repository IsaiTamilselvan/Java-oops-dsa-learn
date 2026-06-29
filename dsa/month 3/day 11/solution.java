class Solution {
    public int[] leftRightDifference(int[] nums) {
        //array for left and right
        int[] leftsum=new int[nums.length];
        int[] rightsum=new int[nums.length];

        //left right sums
        int lpx=0;
        int rpx=0;
        //rpx sum
        for(int i=0;i<nums.length;i++){
            rpx+=nums[i];
        }
        //check sums
        for(int i=0;i<nums.length;i++){
            rpx-=nums[i];
            rightsum[i]=rpx;
            leftsum[i]=lpx;
            lpx+=nums[i];
            
            nums[i]=Math.abs(leftsum[i]-rightsum[i]);
        }
        return nums;
    }
}
