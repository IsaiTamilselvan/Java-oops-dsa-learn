public class slide1{
    public static void main(String args[]){
        int[] arr={1,4,4};
        int k=4;

        int sum=0;
        int l=0;
        int len=0;
        int sml=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            len++;

            while(sum>=k){
                sum=sum-arr[l];
                l++;
                len--;
            }

            if(len<sml){
                sml=len;
            }
        }
        System.out.println(sml);
    }
}
