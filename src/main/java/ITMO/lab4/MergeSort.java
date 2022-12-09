package ITMO.lab4;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }
        System.out.println(Arrays.toString(array));

        mergeSort(array, array.length);
        System.out.println(Arrays.toString(array));

    }

    public static void mergeSort(int[] array, int arrayLength) {
        if (arrayLength < 2) {
            return;
        }
        int midOfArray = arrayLength / 2;

        int[] leftSide = new int[midOfArray];
        int[] rightSide = new int[arrayLength - midOfArray];

        for (int i = 0; i < midOfArray; i++) {
            leftSide[i] = array[i];
        }
        for (int i = midOfArray; i < arrayLength; i++) {
            rightSide[i - midOfArray] = array[i];
        }
        mergeSort(leftSide, midOfArray);
        mergeSort(rightSide, array.length - midOfArray);

        merge(array, leftSide, rightSide,arrayLength - midOfArray, midOfArray);
    }

    private static void merge(int[] array, int[] leftSide, int[] rightSide, int rightIndex, int leftIndex) {
        int iIndexOfNum = 0, jIndexOfNum = 0, kIndexOfNum = 0;
        while (iIndexOfNum < leftIndex && jIndexOfNum < rightIndex) {
            if (leftSide[iIndexOfNum] <= rightSide[jIndexOfNum]) {
                array[kIndexOfNum++] = leftSide[iIndexOfNum++];
            } else {
                array[kIndexOfNum++] = rightSide[jIndexOfNum++];
            }
        }

        while (iIndexOfNum < leftIndex) {
            array[kIndexOfNum++] = leftSide[iIndexOfNum++];
        }

        while (jIndexOfNum < rightIndex) {
            array[kIndexOfNum++] = rightSide[jIndexOfNum++];
        }

    }
}
