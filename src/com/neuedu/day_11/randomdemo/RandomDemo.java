package com.neuedu.day_11.randomdemo;


public class RandomDemo {
    public static void testSoft() {
        int len = 10;
        int arr[] = new int[10];
        int low = 0;
        int high = arr.length - 1;
        for (int i = 0; i < len; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        for (int i : arr
        ) {
            System.out.print(i + " ");
        }
        quickSort(arr, low, high);
    }

    public static void quickSort(int arr[], int f, int l) {
        int low = 0;
        int high = arr.length - 1;
        if (low < high) {
            int index = getIndex(arr, low, high);     //找到当前的基准值
            quickSort(arr, low, index - 1);        //对基准值左边的进行排序
            quickSort(arr, index + 1, high);        //对基准值右边的进行排序
        }
    }

    public static int getIndex(int arr[], int f, int l) {
        int temp = arr[f];
        while (f != l) {
            while (f != l) {
                if (arr[l] < temp) {
                    arr[f] = arr[l];
                    break;
                } else {
                    l--;
                }
            }
            while (l != f) {
                if (arr[f] > temp) {
                    arr[l] = arr[f];
                    break;
                } else {
                    f++;
                }
            }
        }
        arr[l] = temp;
        return l;
    }

    public static void main(String[] args) {
//        System.out.println(Math.random());
//        int i = (int)(Math.random()*2);
//        System.out.println("i = " + i);
//        if (i == 1) {
//            System.out.println("");
//        }
        testSoft();
    }
}
