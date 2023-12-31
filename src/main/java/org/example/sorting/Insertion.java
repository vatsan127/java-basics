package org.example.sorting;

import java.util.Arrays;

public class Insertion {
    public static void insertionSort(int arr[], int length) {
        for (int i = 1; i < length; i++) {
            int value = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > value) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=value;
        }
    }

    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90, 87};
        insertionSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
