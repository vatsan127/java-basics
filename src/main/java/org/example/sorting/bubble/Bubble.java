package org.example.sorting.bubble;

import java.util.Arrays;
import java.util.function.Predicate;

public class Bubble {
    public static void bubbleSort(int[] arr) {

        int numberOfIterations = arr.length - 1;
        Predicate<Integer> checkElements = index -> arr[index] > arr[index + 1];
        boolean isSwapped = false;

        for (int i = 0; i < numberOfIterations; i++) {
            int numberOfElemetsToCheck = numberOfIterations - i;
            for (int j = 0; j < numberOfElemetsToCheck; j++) {
                if (checkElements.test(j)) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90, 87};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
