class gcdSum {
    public long gcdSum(int[] nums) {
        
        int[] pxGcd=new int[nums.length];
        int lar=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(lar<nums[i]){
                lar=nums[i];
            }

            int temp=gcd(nums[i],lar);
            pxGcd[i]=temp;
        }
        Arrays.sort(pxGcd);

        long totalSum = 0;
        int left = 0;
        int right = pxGcd.length - 1;

        while (left < right) {
            int result = gcd(pxGcd[left], pxGcd[right]);
            totalSum += result;
            
            left++;  
            right--; 
        }
        return totalSum;

    }
    public static int gcd(int l, int s) {
        int a = Math.max(l, s);
        int b = Math.min(l, s);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
