class reverseVowels {
    public String reverseVowels(String s) {

        char[] sarr = s.toCharArray();
        
        int l=0;
        int r=sarr.length-1;

        while(l<r){
            while(l<r && !isVowels(sarr[l])){
                l++;
            }
            while(l<r && !isVowels(sarr[r])){
                r--;
            }

            char temp=sarr[l];
            sarr[l]=sarr[r];
            sarr[r]=temp;
            l++;
            r--;
        }

    return new String(sarr);
    }
    public static boolean isVowels(char c){
        if(c == 'A' ||c == 'E' ||c == 'I' ||c == 'O' ||c == 'U') return true;

        if(c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u') return true;

        return false;
    }

}
