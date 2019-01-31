import java.io.*;
import java.util.*;
class FileDemo {
   public static void main(String[] args) {
      File f = null;
      try {
            f = new File("abc.txt");//or dont create object of file  FileDemo f=new FileDemo("abc.txt")
            FileWriter fout = new FileWriter(f);
            BufferedWriter bout= new BufferedWriter(fout);
	     Scanner sc = new Scanner(System.in);
            String s;
            System.out.print("\nEnter a String");
 	     while(sc.hasNext()){
               bout.write(sc.next());
               bout.newLine();
        }
            bout.close();
}         
    catch (Exception e) {
         // if any I/O error occurs
         e.printStackTrace();
      }    } }
