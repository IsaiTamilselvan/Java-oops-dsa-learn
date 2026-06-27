public class level2 {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8};
        int[] prefix=new int[arr.length];
        int even=0;
        int odd=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0) {
                even++;
                prefix[i]=even;
            }
            if (arr[i]%2!=0) {
                odd++;
                prefix[i]=odd;
            }
        }
        System.out.println(evenInRange(prefix, 0, 3));
        System.out.println(evenInRange(prefix, 2, 6));
        
    }
    public static int evenInRange(int[] prefix,int l,int r){
        if(l==0){
            return prefix[r];
        }
        return prefix[r]-prefix[l-1];
    }
}
