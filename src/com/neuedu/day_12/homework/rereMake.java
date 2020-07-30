package com.neuedu.day_12.homework;

public class rereMake {
    public static void main(String[] args) {
        int [] a={30,9,5,7,35,1,60,12};
        int start = 0;
        int end = a.length-1;
        sort(a,start,end);
        show(a);
    }
    public static void sort(int arr[],int start,int end){
        int i=start;
        int j=end;
        int temp=arr[i];   //不能arr[0]!!!!!
        if (i<j){
            while (i<j){
                while (i<j&&arr[j]>=temp){
                    j--;
                }
                arr[i]=arr[j];
                while (i<j&&arr[i]<=temp){
                    i++;
                }
                arr[j]=arr[i];
            }
            arr[i]=temp;
        }
        if (i>start){
            sort(arr,start,i-1);
        }
        if (j<end){
            sort(arr,i+1,end);
        }
    }
    public static void show(int arr[]){
        for (int i:arr
             ) {
            System.out.print(i+" ");
        }
    }
}
