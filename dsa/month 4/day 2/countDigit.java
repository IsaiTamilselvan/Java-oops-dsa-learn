public class countDigit {
    public static void main(String[] args) {
        int nums=95731;
        System.out.print(countdigit(nums));
    }
    public static int countdigit(int nums){

        if(nums==0){
            return 0;
        }
        int count=1;
        return count+countdigit(nums/10);
    }
}
