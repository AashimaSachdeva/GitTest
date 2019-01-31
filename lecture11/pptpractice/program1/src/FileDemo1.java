import java.io.*;
 class FileDemo1{
   
   public static void main(String[] args) {
      File f = null;
      
      try {
         
            f = new File("abc.txt");
            String s;
            FileReader fin = new FileReader(f);
      BufferedReader bin= new BufferedReader(fin);
            while((s=bin.readLine())!=null)
            {
     System.out.print(" "+s);
      }           
         } 
       catch (Exception e) {
         // if any I/O error occurs
         e.printStackTrace();
      }
   }
}

