package IQ;

public class MissingNumber {

    public static void main(String[] args) {
        int[] myarray={1,2,3,4,6};
        int sum=0;
        for (int i=0;i<myarray.length;i++){
            sum=sum+myarray[i];
        }
        //System.out.println(sum);

        int sum2=0;
        for(int i=1;i<=6;i++){
            sum2=sum2+i;
        }
        System.out.println(sum2-sum);
    }
}
