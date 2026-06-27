public class revChar{
    public static void main(String[] args) {
        char[] arr={'a','$','b','+','c','@','!',':','d','#'};

        int l=0;
        int r=arr.length-1;

        while(l<r){
            while(!Character.isLetterOrDigit(arr[l])) l++;
            while(!Character.isLetterOrDigit(arr[r])) r--;

            char t=arr[l];
            arr[l]=arr[r];
            arr[r]=t;
            l++;
            r--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
