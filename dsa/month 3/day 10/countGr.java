public class countGr {
    public static void main(String[] args) {
        int[] arr = {2,5,1,7,4,8,3};

        System.out.println(countGR(arr,0,3));
        System.out.println(countGR(arr,2,5));
        System.out.println(countGR(arr,1,6));

    }
    public static int countGR(int[] arr,int l,int r){
        int[] prefix=new int[arr.length];
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>3){
                count++;
                prefix[i]=count;
            }
            prefix[i]=count;
        }
        if(l==0){
            return prefix[r];
        }
        return prefix[r]-prefix[l-1];
    }
}
