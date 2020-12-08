package link;

public class Demo4 {
    public static void main(String[] args) {

        int myArray[] ={3,5,7,1,9,6};

        int largest=0;
        int secondLargest=0;

        for (int i=0; i<myArray.length; i++) {

            if(myArray[i]>largest){
                secondLargest=largest;
                largest=myArray[i];

            }else if(myArray[i]>secondLargest){
                secondLargest=myArray[i];
            }
        }
        System.out.println(secondLargest);
    }
}
