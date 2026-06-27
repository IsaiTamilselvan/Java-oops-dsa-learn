public class prefix {
    public static void main(String[] args) {
        int[] arr = {3,2,4,1,5};
        // 3 5 9 10 15
        int[] prefixarray=new int[arr.length];
        //first element
        prefixarray[0]=arr[0];
        //prefix array creation
        for (int i = 1; i < arr.length; i++) {
            prefixarray[i]=arr[i]+prefixarray[i-1];
        }
        //find sum(1,3)
        int result=prefixarray[3]-prefixarray[0];

        System.out.print(result);
    }
}
