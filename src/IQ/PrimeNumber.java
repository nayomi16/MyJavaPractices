package IQ;

public class PrimeNumber {
    public static void main(String[] args) {
        int num=2;
        System.out.println(isPrime(num));
    }

    static boolean isPrime(int number){
        if(number>1){
            for(int i=2;i<=number;i++){
                if(number%i==0 && i!=number){
                    return false;
                }else return true;

            }
        }
        return false;
    }
}
