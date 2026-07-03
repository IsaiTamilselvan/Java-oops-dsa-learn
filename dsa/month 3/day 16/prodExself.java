public class prodExSelf{
    public static void main(String[] args) {
        int[] arr={2,3,4,5};
        //expected op [60,40,30,24]
        int n=arr.length;
        //prefix sum
        int[] px=new int[n];
        px[0]=arr[0];
        for (int i=1;i<n;i++) {
            px[i]=arr[i]*px[i-1];
        }
        //suffix sum
        int[] sx=new int[n];
        sx[n-1]=arr[n-1];
        for (int i=n-2;i>=0; i--) {
            sx[i]=arr[i]*sx[i+1];
        }

        //output generation
        int[] result=new int[n];
        for (int j = 0; j < sx.length; j++) {
            if(j==0){
                result[j]=sx[j+1];
                continue;
            }
            else if(j==n-1){
                result[j]=px[j-1];
                break;
            }
            else{
                result[j]=px[j-1]*sx[j+1];

            }
        }

        for (int k : result) {
            System.out.println(k);
        }
    }    
}
