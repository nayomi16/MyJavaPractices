package second;

public class Demo {
    public static void main(String[] args) {
        int myArray[]={2,5,67,34,12};

        int largest=0;
        int secondlargest=0;

        for (int i=0; i<myArray.length; i++){
            if(myArray[i]>largest){
                secondlargest=largest;
                largest=myArray[i];
            }else if(myArray[i]>secondlargest){
                secondlargest=myArray[i];
            }
        }
        System.out.println(secondlargest);
    }
}
