/*Author:Aashima
Version:1.0.0
Purpose :Java program to display Pascal's triangle */
class Pascal
{
	public static void main(String args[])
	{
	 int i,j;
     for(i=0;i<=5;i++)
     {
     	int number=1;
     	System.out.format("%" +(5-i) *2+"s"," ");
     	for(j=0;j<=i;j++)
     	{
     		System.out.format("%4d",number);
     		number=number*(i-j)/(j+1);
     		}
     		System.out.println();
     		}
     		}
     	}
     

