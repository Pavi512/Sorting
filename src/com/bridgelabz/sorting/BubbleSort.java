package com.bridgelabz.sorting;

//Bubble sort class
public class BubbleSort {
    public static void main(String[] args) {

        int[] marks = {99, 55, 88, 73, 65};

        System.out.println("Before Sorting:");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }

        for (int i = 0; i < marks.length - 1; i++) {
            for (int j = 0; j < marks.length - 1 - i; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                }
            }
        }

        System.out.println("\nAfter Sorting:");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }
}
