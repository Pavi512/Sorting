package com.bridgelabz.sorting;

//Selection sort class
public class SelectionSort {

    public static void main(String[] args) {

        int[] scores = {55, 45, 98, 30, 69};

        System.out.println("Before Sorting:");
        for (int score : scores)
            System.out.print(score + " ");

        for (int i = 0; i < scores.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = scores[i];
            scores[i] = scores[minIndex];
            scores[minIndex] = temp;
        }

        System.out.println("\nAfter Sorting:");
        for (int score : scores)
            System.out.print(score + " ");
    }
}
