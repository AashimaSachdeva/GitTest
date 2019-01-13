/*Author:Aashima
Version:1.0.0
Purpose:Java program to display the following character rhombus structure. */
class Rhombus
{
	public static void main(String args[])
	{   
		int i,j,n,spc;
		int count=1;
		int count2=1;
		char c='A';
		for(i=1;i<(7*2);i++)
		{
			for(spc=7-count2;spc>0;spc--)
			{
				System.out.print(" ");

			}
			if(i<7){
				count2++;

			}
			else {
				count2--;
			}
			for(j=0;j<count;j++)
			{
				System.out.print(c);
				if(j<count/2)
				{
					c++;

				}
				else
				{
					c--;

				}
			}
			if(i<7)
			{
				count=count+2;
			}
			else {
				count=count-2;
			}
			c='A';

			System.out.println();
		}
	}
			}
		