package com.neuedu.day_18.homework;

public class work04 {
    public static int binarysearch(int arr[], int k) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int mid = (j - i) / 2 + i;
            if (k < arr[mid]) {
                j = mid - 1;
            } else if (k > arr[mid]) {
                i = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = binarysearch(arr, 8);
        System.out.println(k);
    }
}
