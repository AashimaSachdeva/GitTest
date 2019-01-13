/*Author:Aashima
Version:1.0.0
Purpose:1.	using all primitive data types of Java analyse the result obtained for different data types. */
class Primitive
{
	public static void main(String args[])
	{
		int num1=2;//declaration of variable
        long num2=6785678;
		short num3=123;
		char ch='a';
		double num5=3.141;
		byte num6=120;
		int r1=num1+ch;//using different operators on primitive datatypes
		int r2=ch/num1;
		double r3=num5+num6;
		System.out.println("Sum of integer and character="+r1);
		System.out.print("division of character and integer="+r2);
		System.out.print("Sum of double and byte="+r3);
	}
}

		
