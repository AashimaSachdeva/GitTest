import java.util.*;
class Array1
{
	public static void main(String args[])
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("Amit");
		al.add("Vijay");
		al.add("Kumar");
		al.add(1,"Sachin");
		System.out.println("elents at second position"+al.get(2));

		ListIterator<String> itr=al.listIterator();
		System.out.println("transversing in forward direction");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("transversing backwards");
		while(itr.hasPrevious())
		{
			System.out.print(itr.previous());
		}

	}
}