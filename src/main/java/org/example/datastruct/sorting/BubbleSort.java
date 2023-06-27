package org.example.datastruct.sorting;

public class BubbleSort {

    public static void main(String[] args) {

        //define an int array
        int[] intArray = {20,35,-15,7,55,1,-22};

        //first loop backward from the end since the sorted part will at the end of the array
        for (int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex>0;lastUnsortedIndex--){

            //second loop
            for (int i = 0; i < lastUnsortedIndex; i++){
                //if i = i+1, then return, i++
                //if i < i+1, then return, i++

                //if i > i+1 swap i with i+1, create a temp variable, tmp=i+1, i+1 = i, i = tmp
                if (intArray[i] > intArray[i+1]){
                    //swapping i with i+1
                    Util.swap(intArray, i, i+1);
                }
            }
        }
        //print sorted array
        Util.print(intArray);

    }

}
