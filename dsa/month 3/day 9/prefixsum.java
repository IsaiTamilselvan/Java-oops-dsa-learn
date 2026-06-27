public class prefixsum {
    public static void main(String[] args) {
        int[] arr = {5,1,3,2,4};
        int[] prefixarray=new int[arr.length];

        prefixarray[0]=arr[0];

        for (int i = 1; i < prefixarray.length; i++) {
            prefixarray[i]=arr[i]+prefixarray[i-1];
        }
        System.out.println(prefixSum(prefixarray,0,3));
        System.out.println(prefixSum(prefixarray,2,4));
        System.out.println(prefixSum(prefixarray,1,1));
    }
    public static int prefixSum(int[] prefixarray,int l,int r){
        if(l==0) return prefixarray[r];

        return prefixarray[r]-prefixarray[l-1];
    }
}
