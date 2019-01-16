class Address
{
	String firstLine;
	String secondLine;
	int pinCode;
Address()
{ 
	firstLine="";
    secondLine="";
	pinCode=122001;
}
Address(String fLine, String sLine, int pCode)
{
	firstLine=fLine;
	secondLine=sLine;
	pinCode=pCode;
}
void display()
{
	System.out.println("Employee address:\n"+this.firstLine+" "+this.secondLine+" "+this.pinCode);                                                                                    

}
}
