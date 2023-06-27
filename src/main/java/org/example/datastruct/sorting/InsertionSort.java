package org.example.datastruct.sorting;

public class InsertionSort {

    public static void main(String[] args) {

        //define an int array
        int[] intArray = {20,35,-15,7,55,1,-22};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++){

            //assigning the element to be inserted
            int newElement = intArray[firstUnsortedIndex];

            //declaring out the inner loop to use it later when assigning array[1]
            int i;

            //looping through unsorted index to
            for (i = firstUnsortedIndex; i > 0 && intArray[i-1] > newElement; i--){
                //shifting if the last position value is greater than the current position value
                intArray[i] = intArray[i-1];
            }

            //when dropping out of the inner loop, i = 0
            intArray[i] = newElement;

        }

        //print sorted array
        Util.print(intArray);

    }

}
