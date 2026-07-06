public class leftByK {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        //reverse whole array
        rotate(arr, 0, arr.length-1);
        //reverse left side
        rotate(arr, 0, k);
        //reverse right side
        rotate(arr, k+1, arr.length-1);

        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static void rotate(int[] arr,int l,int r){
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
}
