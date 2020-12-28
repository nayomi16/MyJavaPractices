package IQ;

public class LagestMinimum {

    public static void main(String[] args) {

        int[] num={2,1,33,5,-44};
        int lagest=num[0];
        int minimum=num[0];

        for(int i=1;i<num.length;i++){
            if(num[i]>lagest){
                lagest=num[i];
            }else if(num[i]<minimum){
                minimum=num[i];
            }
        }
        System.out.println("lagest number is "+lagest);
        System.out.println("smallest number is "+minimum);
    }
}
