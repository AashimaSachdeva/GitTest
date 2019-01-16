/*Author:Aashima
Version:1.0.0
Purpose:3.  Use a two-dimensional array to solve the following problem: A company has four salespeople (1 to 4) who sell five different products (1 to 5). Once a day, each salesperson passes in a slip for each type of product sold. Each slip contains the following:
a) The salesperson number
b) The product number
c) The total dollar value of that product sold that day
Thus, each salesperson passes in between 0 and 5 sales slips per day. Assume that the information
 from all the slips for last month is available. Write an application that will read all 
 this information for last week’s sales and summarize the total sales by salesperson and by product. */


import java.util.*;
public class Sales
{
  Scanner scan = new Scanner(System.in);

    public static void main(String[]args)
    {
      // declare and initialize the array //
        float sales[][] = new float [5][4];


    Sales sale = new Sales(); //object of class


        // call the function to read in the sales from the user//
        sale.getSales(sales);
 
        System.out.print("\t\t\tSP1\t\tSP2\t\tSP3\t\tSP4\t\tTotal\n\n");
       // call the function to display the sales//
      sale.printSales(sales);
    }
 
   


   /*getSales  *Description: reads sales figures in from the user until the user enters -1*/
  
  void getSales(float sales[][])
    {
      int salesPerson;
      int product;
      float value;
    System.out.println("Enter the salesperson, product, and total sales:");
        for (int i=0;i<4;i++)
        {
          System.out.print("SalesPerson: ");
          salesPerson = scan.nextInt();
          System.out.println();
          System.out.print("Product: ");
          product = scan.nextInt();
          System.out.println();
          System.out.print("Sales: ");
      value = scan.nextFloat();
      System.out.println("\n");
            sales[product - 1][salesPerson - 1] += value;
        }
    }


    //Description: displays the sales and summaries
  

  void printSales(float sales[][])
  {
      for (int i=0; i<5;i++)
      {
        System.out.print("Product "+(i+1)+"\t\t");
        System.out.print(sales[i][0]+"\t\t"+sales[i][1]+"\t\t"+sales[i][2]+"\t\t"+sales[i][3]+"\t\t");
        System.out.println((sales[i][0]+sales[i][1]+sales[i][2]+sales[i][3]));
      }
      System.out.print("\nTotal\t\t\t");
      for (int j=0;j<4;j++)
      {
        System.out.print((sales[0][j]+sales[1][j]+sales[2][j]+sales[3][j]+sales[4][j])+"\t\t");
      }
      System.out.println("");
    }
}
