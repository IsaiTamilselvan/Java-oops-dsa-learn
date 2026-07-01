class productExceptSelf {
    public int[] productExceptSelf(int[] nums) {

        int[] px=new int[nums.length];
        px[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            px[i]=nums[i]*px[i-1];
        }
        int[] sx=new int[nums.length];
        sx[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            sx[i]=nums[i]*sx[i+1];
        }
        for(int i=0;i<nums.length;i++){
            if(i==0){
                nums[i]=sx[i+1];
                continue;
            }
            if(i==nums.length-1){
                nums[i]=px[i-1];
                break;
            }
            nums[i]=px[i-1]*sx[i+1];

        }
        return nums;
    }
}
