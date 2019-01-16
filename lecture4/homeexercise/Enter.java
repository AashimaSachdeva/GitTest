/*Author:Aashima
Version:1.0.0
Purpose:1.	Write a program that reads a 2-D integer array with each element of maximum 2 digits and prints the following:
a)	Elements of the entered array. 
b)	Elements of the array after each element is multiplied by 2 if it is an odd number.*/

import java.util.*;
public class Enter
{
	public static void main (String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 2-D array (4x4) and each element must be of two digits");
		int arr [][]=new int[4][4];
		for (int i=0;i<4;i++)
		{
			for (int j=0; j<4;j++)
			{
				arr[i][j] = scan.nextInt();
				while(true)
				{
					if (arr[i][j]>9 && arr[i][j]<100)
						break;
					else
					{
						System.out.println("Re-enter the element TWO DIGIT");
						arr[i][j] = scan.nextInt();
					}
				}
			}
		}
		System.out.println("The entered 2-D array in matrix form is:");
		for (int i=0;i<4;i++)
		{
			for (int j=0; j<4;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
		System.out.println("");
		}
		for (int i=0;i<4;i++)
		{
			for (int j=0;j<4;j++)
			{
				if (arr[i][j]%2==1)
					arr[i][j]*=2;
				else
					continue;
			}
		}
		System.out.println("Array after being operated is:");
		for (int i=0;i<4;i++)
		{
			for (int j=0; j<4;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
		System.out.println("");
		}
	}
}