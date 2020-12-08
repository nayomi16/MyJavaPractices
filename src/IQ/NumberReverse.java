package IQ;

public class NumberReverse {
    public static void main(String[] args) {
        int x=12345;
        int rev=0;

        while (x!=0){
            rev=rev*10 + x%10;
            x=x/10;
        }

        System.out.println(rev);

        //System.out.println(new StringBuffer(String.valueOf(x)).reverse());
    }
}
