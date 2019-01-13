/*Author:Aashima
Version:1.0.0
Purpose:1.	Write a program that takes two integers (values to be given within the program) and displays the output of 
the following operators: addition, subtraction, multiplication, division and modulus. */
class Airthmetic
{
	public static void main(String args[])
	{
		int num1,num2,sum,sub,mult,div,mod;//declaration of variables
		num1=2;//initialization of variables
		num2=3;
		sum=num1+num2;//using formula to perform airthemetic operations
		sub=num1-num2;
		mult=num1*num2;
		div=num1/num2;
		mod=num1%num2;
		System.out.print("addition "+sum+" " );

System.out.print("subtraction "+sub+" " );

System.out.print("multiplication "+mult+" " );

System.out.print("division "+div+" " );

System.out.print("modulus "+mod+" " );
}
}
