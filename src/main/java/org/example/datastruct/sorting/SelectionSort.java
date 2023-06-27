package org.example.datastruct.sorting;

public class SelectionSort {

    public static void main(String[] args) {

        //define an int array
        int[] intArray = {20,35,-15,7,55,1,-22};

        //first loop backward from the end since the sorted part will at the end of the array
        for(int lastUnsortedIndex= intArray.length-1; lastUnsortedIndex>0; lastUnsortedIndex--){

            //largest index by default will be the very first index of the array
            int largestValueIndex = 0;

            //second loop from 0 to last unsorted index
            for (int i=1; i <= lastUnsortedIndex; i++){

                //if i > i+1, change index of the largest value with i
                if (intArray[i]>intArray[largestValueIndex]){
                    largestValueIndex = i;
                }

                //at the end, which is the last unsorted index, swap the maximum with the last unsorted index
                Util.swap(intArray,largestValueIndex,lastUnsortedIndex);
            }
        }

        //print sorted array
        Util.print(intArray);

    }
}
