/*Author:Aashima
Version:1.0.0
Purpose:program to input one number consisting of five digits from the user, separates the number into its individual digits in the same order and 
prints the digits separated from one another by three spaces each.*/
import java.util.Scanner;
class Mdata
{
	public static void main(String args[])
	{   
		int num,rem=0,rem1,rem2,rem3,rem4,rem5;//declaration of variable
		System.out.print("enter 5 digit number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
        rem1=num/10000;
       
        rem2=(num%10000)/1000;
       
         rem3=((num%10000)%1000)/100;
        
         rem4=(((num%10000)%1000)%100)/10;
         rem5=(((num%1000)%1000)%100)%10;
         System.out.print(rem1+"   "+rem2+"   "+rem3+"   "+rem4+"   "+rem5+"   ");
        

    }
}

		
		