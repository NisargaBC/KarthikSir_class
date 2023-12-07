package com.bubble_sort;

import java.util.Arrays;

class Bubble_sort
{
	 static void sort(int [] arr)
	{
		int n = arr.length;
		int temp = 0;
		
		for(int i=0; i<n; i++)
		{
			for(int j=1; j<n; j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j]= temp;
				}
				
			}
		}
		
	}
}

public class Program1_bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {54, 2, 78, 14, 71, 23};
		
		for(int i= 0; i<arr.length;i++)
		{
			System.out.println(arr[i]+ " ");
		}
		System.out.println("after sort");
		
		Bubble_sort.sort(arr);
			
		for(int i= 0; i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();
		for(int i =arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i]+ " ");
		}
		
	}

}
