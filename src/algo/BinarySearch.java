package algo;

public class BinarySearch {

    public static void main(String[] args) {
        int myArray[]={-2, 4,5, 7, 70, 80, 90};
        System.out.println(binarySearch(myArray, 5));
    }

    public static int binarySearch(int[] myarray, int value){
        int startIndex=0;
        int endIndex=myarray.length;


        while (startIndex<endIndex){
            int midIndex = (startIndex+endIndex)/2;
            System.out.println(midIndex);

            if(myarray[midIndex]==value){
                return midIndex;
            }else if(myarray[midIndex]<value){
                startIndex=midIndex+1;
            }else{
                endIndex=midIndex;
            }
        }
        return -1;
    }
}
