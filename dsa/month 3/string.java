//string day--------------

public class string {
    public static void main(String[] args) {
        String s="hello";

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }

        int vowelCount=0;

        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if(isVowels(c)){
                vowelCount++;
            }
        }
        System.out.println(vowelCount);

        String fruit="banana";
        char target='a';

        for (int i = 0; i < fruit.length(); i++) {
            if(fruit.charAt(i)==target){
                System.out.println("first occurance of target at:"+i);
                break;
            }
        }

        String jewels = "z";
        String stones = "zZ";
        int res=0;
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if(jewels.charAt(i)==stones.charAt(j)){
                    res++;
                }
            }
        }
        System.out.println(res);

        String msg="HELLO";
        String msgLower="";
        for (int i = 0; i < msg.length(); i++) {
            char c=msg.charAt(i);
            c=(char)(c+32);
            msgLower+=c;
        }
        System.out.println(msgLower);


    }

    public static boolean isVowels(char c){
        if(c == 'a' || c== 'e' || c == 'i' || c== 'o' || c == 'u'){
            return true;
        }
        if(c == 'A' || c== 'E' || c == 'I' || c== 'O' || c == 'U'){
            return true;
        }
        return false;
    }
}
