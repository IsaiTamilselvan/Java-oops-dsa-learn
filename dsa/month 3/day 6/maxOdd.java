//recall day
public class maxOdd{
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4,7,9};
        int k = 3;
        int odd=0;
        int maxOdd=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            if(arr[i]%2!=0) odd++;
        }
        if(odd>maxOdd) maxOdd=odd;
        for (int i = k; i < arr.length; i++) {
            if(arr[i-k]%2!=0) odd--;
            if (arr[i]%2!=0) odd++;
            if(odd>maxOdd) maxOdd=odd;
        }
        System.out.println(maxOdd);
        
    }
}
