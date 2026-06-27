//prefix practice problem
public class level1 {
    public static void main(String[] args) {
        int[] arr = {2,4,1,5,3};
        int[] prefixarray=new int[arr.length];

        prefixarray[0]=arr[0];
        System.out.println("prefix array");
        System.out.println(prefixarray[0]);

        for (int i = 1; i < prefixarray.length; i++) {
            prefixarray[i]=arr[i]+prefixarray[i-1];
            System.out.println(prefixarray[i]);
        }
        System.out.println("prefix sum of (2,4)");
        System.out.println(prefixSum(prefixarray, 2, 4));
        System.out.println("prefix sum of (0,4)");
        System.out.println(prefixSum(prefixarray, 0, 4));
    }
    public static int prefixSum(int[] arr,int l,int r){
        if(l==0){
            return arr[r];
        }
        return arr[r]-arr[l-1];
    }
}
