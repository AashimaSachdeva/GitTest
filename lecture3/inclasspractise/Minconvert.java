/*Author:Aashima
Version:1.0.0
Purpose:writing a program to convert minute into days,month and year.
Input value to be given within the program*/
class Minconvert{
	public static void main(String args[])
	{                                
	    int min;//declarationand of variable
		min=2;//initialization of variable
		int day=min/1440;//dividing time value with suitable integer value to convert minute into days,month and year
	    int year=min/525600;
		System.out.print("converted min into day="+day);
	System.out.print("converted min into year="+year);
	} 
}
