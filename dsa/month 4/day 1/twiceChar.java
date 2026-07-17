public class twiceChar {
    public static void main(String[] args) {
        String s="programming";

        int[] freq=new int[26];

        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }

        for (int i = 0; i < freq.length; i++) {
            if(freq[i]==2){
                System.out.println((char)(i+'a'));
            }
        }
    }
}
