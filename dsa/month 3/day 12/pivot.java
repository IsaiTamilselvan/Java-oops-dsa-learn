public class pivot {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        int lpx=0;
        int rpx=0;
        int pivot=0;
        for (int i = 0; i < nums.length; i++) {
            rpx+=nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            rpx-=nums[i];
            if(rpx==lpx){
                pivot=i;
                break;
            }
            lpx+=nums[i];
        }
        System.out.println(pivot);
    }
}
