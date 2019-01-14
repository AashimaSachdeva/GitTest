/*Author:Aashima
Version:1.0.0
Purpose:1.      Write a Java program to find the index of an array element in an
 array of size 10. The program should not use any function other than main ( ) functions. */


import java.util.*;
class Index{
	public static void main(String args[])
	{
		int selement;//selement variable is used for element to be searched
		int flag=-1;
		int counter=0;
        Scanner scan=new Scanner(System.in);
        int element[]=new int[10];
        //a.the program ask the user to enter the element in the array
        System.out.print("enter 10 elements in the array");
        for(counter=0;counter<10;counter++)
        {
        	element[counter]=scan.nextInt();

        }
        //b.the program asks user to enter the number to be searched
        System.out.print("enter the element you want to add");
        selement=scan.nextInt();
        //c.display the element in the array
        System.out.println("the following elements were entered in the array");
        for(counter=0;counter<10;counter++)
        {
        	System.out.println(element[counter]);
        }
        //d.the program should display the index of the number if the item is present then display 1 or dispaly -1 if the element is not present
        for(counter=0;counter<10;counter++)
        {
        	if(element[counter]==selement)
        	{
        		flag=1;
        		break;
        	}
        	else
        	{
        		flag=-1;
        	}
        }
        if(flag==1)
        {
        	System.out.print("element"+element[counter]+"found at position :"+(counter+ 1));

        }
        else
        {
        	System.out.print("element not found"+flag);
        }
}
}