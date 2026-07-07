public class sorted2sum {
    public static void main(String[] args) {
        int[] numbers={2,7,11,15};
        int target=9;
        int l=0;
        int r=numbers.length-1;

        while(l<r){
            if(numbers[l]+numbers[r]>target) r--;
            
            else if(numbers[l]+numbers[r]<target) l++;

            if(numbers[l]+numbers[r]==target){
                System.out.print(l+1);
                System.out.print(r+1);
                return;
            }
        }
    }
}
