public class sumExSelf{
    public static void main(String[] args) {
        int[] arr={2,3,4,5};
        int n=arr.length;
        int[] leftsub=new int[n];
        leftsub[0]=arr[0];
        for (int i = 1; i < n; i++) {
            leftsub[i]=arr[i]+leftsub[i-1];
        }
        int[] rightsub=new int[n];
        rightsub[n-1]=arr[n-1];
        for (int i = n-2; i >=0; i--) {
            rightsub[i]=arr[i]+rightsub[i+1];
        }
        for (int i = 0; i < n; i++) {
            if(i==0){
                arr[i]=rightsub[i+1];
            }
            else if(i==n-1){
                arr[i]=leftsub[i-1];
            }
            else{
                arr[i]=leftsub[i-1]+rightsub[i+1];
            }
        }
        for (int k : arr) {
            System.out.println(k);
        }
    }
}
