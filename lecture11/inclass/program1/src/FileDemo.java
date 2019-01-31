import java.io.*;
import java.util.*;
class FileDemo {
public static void main(String[] args) 
{
try {
  File f=new File("abc.txt");
  FileWriter fout = new FileWriter(f);
  BufferedWriter bout= new BufferedWriter(fout);
	Scanner sc = new Scanner(System.in);
  boolean flag=true;
  while(flag)
  {
    System.out.println("enter s.no");
    bout.write(Integer.toString(sc.nextInt()));
    bout.write(' ');
    System.out.println("enter name");
    bout.write(sc.next());
    bout.write(' ');
    System.out.println("enter cgpa");
    bout.write(Float.toString(sc.nextFloat()));
    bout.write(' ');
    System.out.println("enter grade (A/B/C/D)");
    bout.write(sc.next().charAt(0));

  bout.newLine();
    System.out.println("Do you want to continue (y/n)");
    char c= sc.next().charAt(0);
    if(c=='n'||c=='N')
    {
      flag = false;
    }
  }
  
  bout.close();



  FileReader fin = new FileReader(f);
  BufferedReader bin= new BufferedReader(fin);
  String sr;
  System.out.println("The contents of file are");
  while((sr=bin.readLine())!=null)
            {
              String[] strs=sr.split(" ");

     System.out.println(strs[0]+" "+strs[1]+" "+strs[2]+" "+strs[3]);
   }
 }
                 
         catch(Exception e)
         {
          System.out.println(e);
         } 
}
}


  
            