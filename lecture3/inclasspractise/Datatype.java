/*Author:Aashima
Version:1.0.0
Purpose:Write a program that displays the sizes and ranges of the different primitive data 
types in Java in the given forma
    S.No. Data Type     Size     Minimum Value      Maximum Value*/

class Datatype{
	public static void main(String[]args)
	{
		int  counter=1;
		//printing datatypes in desired format
System.out.println("s No."+"\t"+"Data type"+"\t"+"Size"+"\t"+"Min value"+"\t"+"Max value");                                                                 
System.out.println((counter++)+"\t"+"Char"+"\t"+Character.TYPE+"\t"+Character.SIZE+"\t"+(int)Character.MIN_VALUE+"\t"+(int)Character.MAX_VALUE);
System.out.println((counter++)+"\t"+"Int"+"\t"+Integer.TYPE+"\t"+Integer.SIZE+"\t"+(int)Integer.MIN_VALUE+"\t"+(int)Integer.MAX_VALUE);
System.out.println((counter++)+"\t"+"Byte"+"\t"+Byte.TYPE+"\t"+Byte.SIZE+"\t"+(int)Byte.MIN_VALUE+"\t"+(int)Byte.MAX_VALUE);
System.out.println((counter++)+"\t"+"Double"+"\t"+Double.TYPE+"\t"+Double.SIZE+"\t"+(int)Double.MIN_VALUE+"\t"+(int)Double.MAX_VALUE);
System.out.println((counter++)+"\t"+"Float"+"\t"+Float.TYPE+"\t"+Float.SIZE+"\t"+(int)Float.MIN_VALUE+"\t"+(int)Float.MAX_VALUE);
System.out.println((counter++)+"\t"+"Long"+"\t"+Long.TYPE+"\t"+Long.SIZE+"\t"+(int)Long.MIN_VALUE+"\t"+(int)Long.MAX_VALUE);
}
}