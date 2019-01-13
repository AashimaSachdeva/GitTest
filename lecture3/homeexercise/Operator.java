/*Author:Aashima
Version:1.0.0
Purpose: /*Write a program to display the results of different relational operators and logical operators
 in Java on two Integer values and two Boolean values. Input values to be given within the program.*/
class Operator
{
	public static void main(String args[])
	{
		int num1,num2;//initialization and declaration of varibles
		num1=10;
		num2=5;
		boolean flag1,flag2;
		flag1=true;
		flag2=false;
		System.out.print("num1=10  num2=5"+"   ");
		if(num1>num2)//using control statement to verify different relational and logical operators
		{
			System.out.print("greatest num1");

		}
else if (num1==num2)
{
	System.out.print("both are equal"+"  ");

}
else
{
	System.out.print("greatest num2"+"  ");

}
System.out.print("   "+"flag1=true  flag2=false"+"   ");
if(flag1&&flag2==flag1)
{
	System.out.print("false"+"  ");
}
else if (flag1||flag2==flag1)
{
	System.out.print("true"+"  ");

}
else 
{
	System.out.print("neither true nor false"+"  ");

}
}
}