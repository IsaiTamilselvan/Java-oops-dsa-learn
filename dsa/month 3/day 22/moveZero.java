public class moveZero{
    public static void main(String[] args) {
        int[] arr={3,0,4,2,0,5,0};

        int r=arr.length-1;
        int l=0;

        while(l<r){
            while(r<arr.length && arr[r]==0) r--;
            while(l<arr.length && arr[l]!=0) l++;

            if (l<r) {
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
            
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
