import java.util.*;
class Simple
{
	public static void main(String args[])
{
	ArrayList a1 =new ArrayList();
	a1.add("ravi");
	a1.add("vijay");
	a1.add("ajay");

	ArrayList a12 =new ArrayList();
	a12.add("ravi");
	a12.add("hanumat");

	a1.removeAll(a12);
	System.out.println("iteration of elements after removing");
	Iterator itr=a1.iterator();
	while(itr.hasNext())
	{
	System.out.println(itr.next());
	}
	
}}
