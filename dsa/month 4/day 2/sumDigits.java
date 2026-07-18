public class sumDigits {
    public static void main(String[] args) {
        int nums=4839;

        System.out.println(sumdigits(nums));
    }
    public static int sumdigits(int nums){
        if(nums==0){
            return 0;
        }
        int digit = nums%10;

        return digit + sumdigits(nums/10);
    }
}
