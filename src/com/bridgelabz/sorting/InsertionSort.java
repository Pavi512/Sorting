package com.bridgelabz.sorting;

//Insertion sort class
public class InsertionSort {

    public static void main(String[] args) {

        int[] empIds = {110, 105, 123, 104, 108};

        System.out.println("Before Sorting:");
        for (int id : empIds) {
            System.out.print(id + " ");
        }

        for (int i = 1; i < empIds.length; i++) {
            int key = empIds[i];
            int j = i - 1;

            while (j >= 0 && empIds[j] > key) {
                empIds[j + 1] = empIds[j];
                j--;
            }

            empIds[j + 1] = key;
        }

        System.out.println("\nAfter Sorting:");
        for (int id : empIds) {
            System.out.print(id + " ");
        }
    }
}
