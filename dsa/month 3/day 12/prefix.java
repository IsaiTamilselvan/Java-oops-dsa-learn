public class prefix{
    public static void main(String[] args) {
        int[] nums={3 ,5 ,7 ,9 ,12};

        System.out.print(nums[0]+", ");
        for (int i = 1; i < nums.length; i++) {
            nums[i]=nums[i]+nums[i-1];
            System.out.print(nums[i]+", ");
        }
    }
}
