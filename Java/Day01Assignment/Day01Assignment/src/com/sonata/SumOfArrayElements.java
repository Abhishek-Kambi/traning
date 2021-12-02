package com.sonata;

public class SumOfArrayElements {
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5,7};
		int sum=0;
		for (int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("The sum of elements in the array is "+sum);
	}
}
