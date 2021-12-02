package com.sonata;

public class FindSpecific {
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5};
		int spe=6;
		boolean find=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==spe)
			{
				find = true;
				break;
			}
		}
		if(find)
		{
			System.out.println("The "+spe+" is in the array");
		}
		else
		{
			System.out.println("The "+spe+" is not in the array");
		}
	}
}
