//rapidfire revision
public class minSum {
    public static void main(String[] args) {
        int[] arr = {4,2,1,7,8,1,2};
        int k = 3;
        int sum=0;
        int minsum=Integer.MAX_VALUE;

        for (int i = 0; i < k; i++) {
            sum+=arr[i];
        }
        if(minsum>sum) minsum=sum;
        for(int i=k;i<arr.length;i++){
            sum-=arr[i-k];
            sum+=arr[i];
            if(minsum>sum) minsum=sum;
        }
        System.out.println(minsum);
    }    
}
