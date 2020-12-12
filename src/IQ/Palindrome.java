package IQ;

public class Palindrome {
    public static void main(String[] args) {

        long number=1235321;
        boolean palindrome = isPalindrome(number);
        System.out.println(palindrome);

    }

    static boolean isPalindrome(long numb){
        long oldnumb=numb;
        long rev=0;
        while(numb!=0){
            rev=rev*10+numb%10;
            numb=numb/10;
        }
        if (oldnumb==rev) return true;
        else  return false;

    }
}
