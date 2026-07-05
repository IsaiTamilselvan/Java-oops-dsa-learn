class rotatebyk{
    public void rotate(int[] nums, int k) {
         int l=0;
        int r=nums.length-1;
        reverse(nums, l, r);
        //reverse right k side
        reverse(nums, k, r);
        //reverse left k side
        reverse(nums, l, k-1);

    }
    public static void reverse(int[] nums,int l,int r){
        while(l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
}
