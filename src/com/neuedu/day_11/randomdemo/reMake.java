package com.neuedu.day_11.randomdemo;

public class reMake {
    public static void main(String[] args) {
        int [] a={30,9,5,7,35,1,60,12};
        int start = 0;
        int end = a.length-1;
        sort(a,start,end);
        for (int i:a
             ) {
            System.out.println(i);
        }
    }

    public static void sort(int arr[],int start,int end){
        int i=start;
        int j=end;
        int temp=arr[i];
        if (i<j){
            while (i<j){
                while (i<j&&arr[j]>=temp){
                    j--;
                }
                arr[i]=arr[j];
                while(i<j&&arr[i]<=temp){
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
}
