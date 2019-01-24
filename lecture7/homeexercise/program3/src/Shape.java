class Shape
{
	private String color;
	private boolean filled;

	public Shape()
	{
		this.color="red";
		this.filled=true;
	}
   public Shape(String color,boolean filled)
{
	this.color=color;
	this.filled=filled;
}
   public void setValueColor(String color)
	{
	this.color=color;
	}
	public void setValueFilled(boolean filled)
	{
	this.filled=filled;
	}
	public String getValueColor()
	{
	return color;
	}
	public boolean getValueFilled()
	{
	return filled;
	}
	public String toString()
	{
		return getValueColor()+"\t\t"+getValueFilled();
	}
}