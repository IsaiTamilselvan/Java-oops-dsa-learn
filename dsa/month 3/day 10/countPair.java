//rapidfire revision
public class countPair {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 8;
        int paircount=0;
        int l=0;int r=arr.length-1;

        while(l<r){
            if(arr[l]+arr[r]<target){
                paircount++;
            }
            l++;r--;
        }
        System.out.println(paircount);
    }
}
