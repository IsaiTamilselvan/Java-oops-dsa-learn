class  gcdOfOddEvenSums{
    public int gcdOfOddEvenSums(int n) {
        
        int sumOdd=0;
        int sumEven=0;

        int k=0;

        //even number sum
        k=2;
        for(int i=0;i<n;i++){
            sumEven+=k;
            k+=2;
        }

        //odd number sum
        k=1;
        for(int i=0;i<n;i++){
            sumOdd+=k;
            k+=2;
        }

        int a = Math.max(sumOdd, sumEven); 
        int b = Math.min(sumOdd, sumEven); 

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }
    
}
