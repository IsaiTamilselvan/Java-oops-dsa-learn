public class countPos {
    public static void main(String[] args) {
        int[] arr = {-1,4,-2,5,6,-3,7};
        int[] prefix=new int[arr.length];
        int count=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                count++;
                prefix[i]=count;
            }
            prefix[i]=count;
        }

        System.out.println(posCount(prefix,0,4));
        System.out.println(posCount(prefix,2,6));
        System.out.println(posCount(prefix,1,5));
    }    
    public static int posCount(int[] prefix,int l,int r){
        if(l==0){
            return prefix[r];
        }
        return prefix[r]-prefix[l-1];
    }
}
