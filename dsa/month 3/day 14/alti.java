public class alti{
    public static void main(String[] args) {
        int[] gain={-5,1,5,0,-7};
        int sum=0;
        int hialt=0;

        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
            if(sum > hialt) hialt=sum;
        }
        System.out.println(hialt);
    }
}
