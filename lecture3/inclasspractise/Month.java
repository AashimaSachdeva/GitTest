/*Author:Aashima
Version:1.0.0
Purpose:writing a program  to take input of number from 1 to 12 and 
display the corresponding month until user wants to exit*/
import java.util.Scanner;
class Month
{
	public static void main(String args[])
	{
		int choice;
		String ans;
		Scanner sc=new Scanner (System.in);
		System.out.print("enter your choice");
		do{
		choice=sc.nextInt();
		switch(choice)/*user will enter choice and corresponding month willbe displayed if a number less than 1 and greater than 12 is 
                    then a message of wrong choice will be displayed*/
		{
			case 1:
			System.out.print("Janurary");
			break;
		   
		    case 2:
			System.out.print("Februray");
			break;
		
			case 3:
			System.out.print("March");
			break;
		
			case 4:
			System.out.print("April");
			break;
		
			case 5:
			System.out.print("May");
			break;
		
			case 6:
			System.out.print("June");
			break;
		
			case 7:
			System.out.print("July");
			break;
		
			case 8:
			System.out.print("August");
			break;
		
			case 9:
			System.out.print("September");
			break;
		
			case 10:
			System.out.print("October");
			break;
		
			case 11:
			System.out.print("November");
			break;
		
			case 12:
			System.out.print("December");
			break;
			default:
		System.out.print("wrong choice");
	}

       System.out.print("do you want to continue(y/n)");//user specific if user wants to continue the press y:yes or n:no
		ans=sc.next();
	}
	while(ans.equals("y")||ans.equals("Y"));
}
}


		