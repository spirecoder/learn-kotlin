package com.spirecoder;

import java.util.Arrays;

public class ArrayRotation {

    private static int[] reverseArray(int[] arrayToRevert) {
        for(int i = 0; i < arrayToRevert.length/2; i++){
            int temp = arrayToRevert[i];
            arrayToRevert[i] = arrayToRevert[arrayToRevert.length -i -1];
            arrayToRevert[arrayToRevert.length -i -1] = temp;
        }

        return arrayToRevert;
    }

    public static void main(String args[]) {
        int[] arrayToRevert = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = reverseArray(arrayToRevert);
        System.out.println(Arrays.toString(result));
    }
}