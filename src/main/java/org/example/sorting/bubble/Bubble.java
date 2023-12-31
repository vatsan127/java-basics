package org.example.sorting.bubble;

import java.util.Arrays;

public class Bubble {
    public static void bubbleSort(int[] arr) {
        boolean swap = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap=true;
                }
            }
            if (!swap){
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
