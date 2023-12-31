package org.example.sorting.selection;

import java.util.Arrays;

public class Selection {
    public static void selectionSort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            int j, temp, index = i;
            for (j = i+1; j < length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90, 87};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
