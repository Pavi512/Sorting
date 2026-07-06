package com.bridgelabz.sorting;

//Heap sort class
public class HeapSort {

    //Heapify method to create the maxheap
    public static void heapify(int[] arr, int n, int i) {

        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {

            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }

    //Heapsort to sort the maxheap
    public static void heapSort(int[] arr) {

        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i = n - 1; i > 0; i--) {

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    //Main method
    public static void main(String[] args) {

        int[] salary = {80000, 38000, 55000, 48000, 70000};

        System.out.println("Before Sorting:");
        for (int s : salary)
            System.out.print(s + " ");

        heapSort(salary);

        System.out.println("\nAfter Sorting:");
        for (int s : salary)
            System.out.print(s + " ");
    }
}
