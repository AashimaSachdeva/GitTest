/*Author:Aashima
Version:1.0.0
Purpose:program that reads in two floating-point numbers and tests 
 whether they are the same up to three decimal places. */
import java.util.Scanner;
class Data
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		float number1;//declaration of variable
		float number2;
		System.out.print("enter first number");
		number1=sc.nextFloat();
		System.out.format("round off the number upto 3 decimal places is%3f\n",number1);//rounding off till 3 digits
		System.out.print("enter second number");
		number2=sc.nextFloat();
		System.out.format("round off number upto 3 decimal places is%3f\n",number2);
		int compare=Float.compare(number1,number2);//comparing both the number
		if(compare>0)
		{
			System.out.print("number1 is greater");
		}
		else if(compare==0)
		{
			System.out.print("both numbers are equal");
	 }
	  else
	  {
	  	System.out.print("number 2 is greater");
	  }
	}
	  }
