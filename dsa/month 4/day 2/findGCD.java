class findGCD {
    public int findGCD(int[] nums) {
        
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>max) max=nums[i];
            if(nums[i]<min) min=nums[i];
        }

        int a = max;
        int b = min;
        
        while (b != 0) {
            int remainder = a % b;
            a = b;          
            b = remainder; 
        }
        return a;
    }
}
