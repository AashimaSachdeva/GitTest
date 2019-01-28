import java.util.*;
class ExceptionHandling
{   
	public static void setTitle(String title)
	{
		if(title==null)
		{
			throw new IllegalArgumentException("");
		}
		System.out.println(title);
		}


	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter your choice");
    System.out.println("1.division,2. for array input ,3.for string input ,4.for making an object");
	int choice=sc.nextInt();
	switch(choice)
	{
		case 1:
		try
		{
			int num1=500,num2=0;
			int output =num1/num2;
			System.out.println("output"+output);
		}
		catch(ArithmeticException e)
		{
			System.out.println("shouldn't divide by 0");
		}
		break;


		case 2:
		try
		{
			int a[]=new int[10];
			a[11]=9;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array index out of bounds");
		}
		break;


		case 3:
		try
		{
			int num=Integer.parseInt("XYZ");
			System.out.println(num);
		}
		catch(NumberFormatException e)
		{
			System.out.println("number format exception occured");
		}
		break;


		case 4:
		try
		{
			String str=null;
			System.out.println(str.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException");
		}
		break;


		 case 5:
		 try
		 {
		 	String x=null;
		 	setTitle(x);
		 }
		 catch(IllegalArgumentException e)
		 {
		 	System.out.println("IllegalArgumentException");
		 }
		 	break;
		 }
		}
	}



		