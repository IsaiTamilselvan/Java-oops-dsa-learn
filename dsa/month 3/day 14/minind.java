public class midind {
    public static void main(String[] args) {
        int[] nums={2,3,-1,8,4};

        int lpx=0;
        int rpx=0;
        for (int i = 0; i < nums.length; i++) {
            rpx+=nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            rpx-=nums[i];
            if(rpx==lpx){
                // return i;
                System.out.println(i);
                break;
            }
            lpx+=nums[i];
        }
    }
}
