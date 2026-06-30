//without extra array 
public class alti2 {
    public static void main(String[] args) {
        int[] gain ={-5,1,5,0,-7};
        int maxalt=0;

        for (int i = 1; i < gain.length; i++) {
            gain[i]=gain[i-1]+gain[i];
            if(gain[i] > maxalt){
                maxalt=gain[i];
            }
        }
        System.out.println(maxalt);
    }
}
