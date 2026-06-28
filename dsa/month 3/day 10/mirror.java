
public class mirror {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,2,1};
        System.out.println(isMirror(arr));
    }
    public static boolean isMirror(int[] arr){
        int l=0;int r=arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[l]!=arr[r]) return false;
        }
        return true;
    }
}
