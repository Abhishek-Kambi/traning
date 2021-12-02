package com.sonata;

public class LargestInArray {
	public static void main(String args[])
	{
		int num[]= {3,4,1,20,5};
		int large=num[0];
		for(int i=0;i<num.length;i++)
		{
			if(large>=num[i])
			{
				large=large;
			}
			else
			{
				large=num[i];
			}
		}
		System.out.println("The largest number in the array "+large);
	}
}
