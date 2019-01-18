class Circle
{
	private float r;
	 public void setRadiusr(float r)
	{
	this.r=r;
	}
	public float getRadiusr()
	{
	return r;
}
public void findArea()
{
	float area= 3.14*r*r;
}
public void displayArea()
{
	System.out.print("area"+area);
}
}