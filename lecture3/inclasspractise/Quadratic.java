/* Author:Aashima
System:1.0.0
Purpose:writing a program to find roots of quadratic equation
input value to be given within program*/
import java.util.*;
class Quadratic
{
	public static void main(String args[])
	{
		int a,b,c;//declaration of variable
		double r1,r2,result;
		Scanner scan=new Scanner(System.in);
		System.out.print("input a:");//initialization of variable
		 a=scan.nextInt();
		System.out.print("input b:");
		 b=scan.nextInt();
		System.out.print("input c:");
		 c=scan.nextInt();
		 result =b*b-4.0*a*c;/*partial solution of the quadratic equation stored in variable */
		/*if value of result is greater than 0 then equation has two roots they can be calculated as displayed
		if value of result is equal to 0 then equation has single root
		else quadratic equation hs no roots*/
		if(result>0.0)
		{
			 r1=(-b+Math.pow(result,0.5))/(2.0*a);
			 r2=(-b-Math.pow(result,0.5))/(2.0*a);
			System.out.println("the roots are="+r1+"and"+r2);
		}
			else if (result==0.0)
			{
				 r1=-b/(2.0*a);
				System.out.print("the roots are="+r1);

			}
			else
			{
				System.out.print("roots doesnot exist");
			}
		}



	}
