package com.kodnest.project;
import java.util.Scanner;

public class BubbleShot {
	public static void main (String[] args)
	{
		System.out.println("user! please enter the size of an Array");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length; i++) {
			a[i]= scan.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]<a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}

			}
		}
		System.out.println("The decending order is:");
		for(int i=0;i<a.length;i++)
		{
			//System.out.println("The decending order is:");
			System.out.println(a[i]+" ");
		}

	}

}
