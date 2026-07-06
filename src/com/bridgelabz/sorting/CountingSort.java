package com.bridgelabz.sorting;

//Counting sort class
public class CountingSort {

    public static void main(String[] args) {

        int[] ages = {11, 17, 13, 15, 12, 14, 10, 16};

        int max = 18;

        //Extra count array to count the frequency of each element up to max.
        int[] count = new int[max + 1];

        //Update count array.
        for (int age : ages)
            count[age]++;

        System.out.println("Sorted Ages:");

        //Print array in sorted order.
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                System.out.print(i + " ");
                count[i]--;
            }
        }
    }
}
