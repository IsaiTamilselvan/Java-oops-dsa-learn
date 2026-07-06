 public class rightByK {
 
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        //reverse entire array
        rotate(arr, 0, arr.length-1);
        //reverse left of array
        rotate(arr, 0, k-1);
        //reverse right of array
        rotate(arr, k, arr.length-1);
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
