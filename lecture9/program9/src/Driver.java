class Driver 
{
	public static void main(String[] args)
	{
		Method obj = new Method();
		try
		{
			obj.f();
		}
		catch (ExceptionInF e)
		{
			System.out.println("Exception thrown by f() caught in Main");
		}
	}
}