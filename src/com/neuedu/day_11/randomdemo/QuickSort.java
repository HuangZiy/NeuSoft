package com.neuedu.day_11.randomdemo;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a={30,9,5,7,35,1,60,12};
		sort(a,0,a.length-1);
		show(a);
	}
	
	public static void sort(int [] a,int start,int end){
		int i=start;
		int j=end;
		int base=a[i];
		if(i<j){
			
			while(i<j){
				while(base<=a[j]&&i<j){
					j--;
				}
				
				a[i]=a[j];
					
				
				while(base>=a[i]&&i<j){
					i++;
				}
				
				a[j]=a[i];
					
				}
			a[i]=base;
			System.out.println("���ֽ�����i="+i+",j="+j);
			System.out.println("=====================");
			
			}
		
		if(start<i)
			sort(a,start,i-1);
		if(end>i)
			sort(a,i+1,end);
		}
		
	
	public static void show(int [] a){
		for(int x:a){
			System.out.print(x+" ");
		}
	}

}
