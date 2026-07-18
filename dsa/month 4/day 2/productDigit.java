public class productDigit {
    public static void main(String[] args) {
        int n=234;
        System.out.println(productdigit(n));
    }
    public static int productdigit(int n){
        if(n==0){
            return 1;
        }
        return n%10 * productdigit(n/10);
    }
}
