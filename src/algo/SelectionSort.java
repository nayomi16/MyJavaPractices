package algo;

public class SelectionSort {

    public static void main(String[] args) {
        int myArray[]={4,3,-2,34,31,12};

        for(int lastUnsortedIndex=myArray.length-1; lastUnsortedIndex>0; lastUnsortedIndex--){
            int largestIndex=0;
            for (int currentIndex=1; currentIndex<=lastUnsortedIndex; currentIndex++){
                if(myArray[largestIndex]<myArray[currentIndex]){
                    largestIndex=currentIndex;
                }
            }
            int temp=myArray[lastUnsortedIndex];
            myArray[lastUnsortedIndex]=myArray[largestIndex];
            myArray[largestIndex]=temp;
        }

        for (int i=0; i<myArray.length; i++){
            System.out.print(myArray[i]+" ");
        }
    }


}
