/*Author:Aashima
Version:1.0.0
Purpose:5.	Write a program to merge two sorted arrays.*/
import java.util.*;
class Sorted
{
	public static void main(String args[])
	{
		int arr1[]=new int[4];
		int arr2[]=new int[5];
		int counter;
		Scanner scan=new Scanner(System.in);
		System.out.print("enter 4 elements in the array1");
        for(counter=0;counter<=3;counter++)
        {
        	arr1[counter]=scan.nextInt();
        }
        System.out.print("enter 5 elements in the array2");
        for(counter=0;counter<=4;counter++)
        {
        	arr2[counter]=scan.nextInt();
        }

       int[] arr3=new int[arr1.length+arr2.length];
		int i=0,j=0,k=0;
		while(i < arr1.length && j < arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				arr3[k]=arr1[i];
						i++;
					}
		
		else
		{
			arr3[k]=arr2[j];
			j++;
		}
		k++;
		}
		if(i<arr1.length)
		{
			System.arraycopy(arr1,i,arr3,k,(arr1.length-i));
		}
		if(j<arr2.length)
		{
			System.arraycopy(arr2,j,arr3,k,(arr2.length-j));
		}
		System.out.println("merged array"+Arrays.toString(arr3));
	}


	}
