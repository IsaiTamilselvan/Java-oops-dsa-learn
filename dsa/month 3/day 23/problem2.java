class problem2 {
    public int[] getConcatenation(int[] nums) {
        int[] ans=new int[nums.length*2];
        int i=0;
        for(i=0;i<nums.length;i++){
            ans[i]=nums[i];
        }
        int j=i;
        for(i=0;i<nums.length;i++){
            ans[j++]=nums[i];
            
        }
        return ans;
    }
}
