package algo;

public class BubbleSort {

    public static void main(String[] args) {
        int myArray[]={-2, 5,4, 10, 7,6};

        for (int lastUnsortedIndex=myArray.length-1; lastUnsortedIndex>0; lastUnsortedIndex--){
            for (int currentIndex=0; currentIndex<lastUnsortedIndex; currentIndex++){
                if (myArray[currentIndex]>myArray[currentIndex+1]){
                    int temp=myArray[currentIndex];
                    myArray[currentIndex]=myArray[currentIndex+1];
                    myArray[currentIndex+1]=temp;
                }
            }
        }
       for (int i=0; i<myArray.length; i++){
           System.out.print(myArray[i]+" ");
       }
        System.out.println();
        System.out.println(binarySearch(myArray, 6));
    }

    public static int binarySearch(int[] myarray, int value){
        int startIndex = 0;
        int endIndex=myarray.length;

        while (startIndex<endIndex){
            int midIndex=(startIndex+endIndex)/2;
            if (myarray[midIndex]==value){
                return midIndex;
            }else if(myarray[midIndex]<value){
                startIndex=midIndex+1;
            }else {
                endIndex=midIndex;
            }
        }
        return -1;
    }
}
