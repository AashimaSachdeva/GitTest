/*Author:Aashima
Version:1.0.0
Purpose :4.	Computing the sum of the series:
      1+x+x2 /2!+x3/3!+……*/
 import java.util.Scanner;
      class Series
{
	public static void main(String args[])
	{
		float x,sum=1,term=1;//initialization and declaration of variables
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter value of x and n number of terms to be sum");
		x=sc.nextInt();
		n=sc.nextInt();
		for(i=1;i<n;i++)//using conrol statement to find sum of series
		{
			term=term*x/(float)i;
			sum=sum+term;

		}
		System.out.print("the sum="+sum);
	}
}
		

