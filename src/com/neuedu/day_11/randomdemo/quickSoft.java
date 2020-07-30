package com.neuedu.day_11.randomdemo;

public class quickSoft {
    public static void sort(int arr[], int start, int end) {
        int i = start;
        int j = end;
        int temp = arr[i];
        if (i < j) {
            while (i < j) {
                while (j > i && arr[j] >= temp) {
                    j--;
                }
                arr[i] = arr[j];
                while (j > i && arr[i] <= temp) {
                    i++;
                }
                arr[j] = arr[i];

            }
            arr[i] = temp;
        }
        if (i > start) {
            sort(arr, start, i-1);
        }
        if (i < end) {
            sort(arr, i+1, end);
        }
    }

    public static void show(int[] arr) {
        for (int a : arr
        ) {
            System.out.print(a + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = {30, 9, 5, 7, 35, 1, 60, 12};
        int i = 0;
        int j = a.length - 1;
        sort(a, i, j);
        show(a);
    }
}
