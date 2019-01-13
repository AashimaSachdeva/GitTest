/*Author:Aashima
Version:1.0.0
Purpose:/* Write a Java program that asks the user to provide a single character from 	the alphabet. Print Vowel or Consonant, depending on the user input. If the user input is
 not a letter (between a and z or A and Z), or is a string of length > 1, print an error message. */
import java.util.Scanner;
class Alphabet
{
	public static void main(String args[])
	{   
		char ch;//declaration of variable
		Scanner sc=new Scanner(System.in);
		System.out.print("enter your choice of character");
		ch=sc.next().charAt(0);//initialization of variable
		//if the input from user is vowel then vowel will be printed if consonanat the consonanat will be printed
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		{
			System.out.print(ch+"is an alphabet");
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.print(ch+"is a vowel");
		}
		else
		{
			System.out.print(ch+"is a consonant");
		}
		}
      else 
        {
        	System.out.println("wrong choice");

        }
    }
}

		
	