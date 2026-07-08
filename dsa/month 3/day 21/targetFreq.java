public class targetFreq {
//comment one main and get the result 
//frequency for target element
    public static void main(String[] args) {
        int[] nums={5,1,5,2,5,3,2};
        int target=5;
        int count=0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target){
                count++;
            }
        }
        System.out.println(count);
    }

//brute force frequency for all element 
    public static void main(String[] args) {
        int[] nums={5,1,5,2,5,3,2};
        int count=0;

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[j]==nums[i] && j!=i){
                    count++;
                }
            }
            System.out.println(nums[i]+"->"+count);
            count=0;
        }

    }

}
