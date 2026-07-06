package com.bridgelabz.sorting;

//Quicksort class
public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    //Main method
    public static void main(String[] args) {

        int[] prices = {960, 800, 558, 654, 187};

        System.out.println("Before Sorting:");
        for (int price : prices)
            System.out.print(price + " ");

        quickSort(prices, 0, prices.length - 1);

        System.out.println("\nAfter Sorting:");
        for (int price : prices)
            System.out.print(price + " ");
    }
}