public class Point2D
{
	float x;
	 float y;

	//constructor
	public Point2D()
	{
	this.x=0.0f;
	this.y=0.0f;
	}
//all dimension specified as argument 
    public Point2D(float x,float y)
    {
	this.x=x;
	this.y=y;
	}
//set get functions
	public void setValuex(float x)
	{
	this.x=x;
	}
	public void setValuey(float y)
	{
	this.y=y;
	}
	public float getValuex()
	{
	return x;
	}
	public float getValuey()
	{
	return y;
	}
	public void setValuexy(float x,float y)
	{
    this.x=x;
	this.y=y;
	}
	float[] getxy(){
	float arr[]=new float[2];
	arr[0]=x;
	arr[1]=y;
	return arr;
	}
	public String toString()
	{
		return (("("+x+","+y+")"));
	}
}