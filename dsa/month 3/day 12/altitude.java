public class altitude {
    public static void main(String[] args) {
        int[] gain ={-5,1,5,0,-7};
        int[] altitude=new int[gain.length+1];
        int maxalt=0;
        altitude[0]=0;

        for (int i = 1; i < altitude.length; i++) {
            altitude[i]=gain[i-1]+altitude[i-1];
            if(altitude[i] > maxalt){
                maxalt=altitude[i];
            }
        }
        System.out.println(maxalt);
    }
}
