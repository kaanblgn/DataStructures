package org.example.datastruct.sorting;

public class Util {

    private Util(){
        throw new IllegalStateException("Utility class");
    }

    public static void swap(int[] array, int i, int j){

        if (i==j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void print(int[] intArray){
        for (int i : intArray) {
            System.out.println(i);
        }
    }
}
