class Point3D extends Point2D
{
 float z;
//constructor
	public Point3D()
	{
		super();
	   this.z=0.0f;
	}
//all dimension specified as argument 
    public Point3D(float x,float y,float z)
	{
		super(x,y);
		this.z=z;
	}
	public void setValuez(float z)
	{
	this.z=z;
	}
	public float getValuez()
	{
	return z;
	}
	public void setValuexyz(float x,float y,float z)
	{
    this.x=x;
    this.y=y;
    this.z=z;
	}
	float[] getxyz(){
		float arr1[] = new float[3];
		arr1[0] = x;
	    arr1[1] = y;
	    arr1[2] = z;
	    return arr1;
	}

	public String toString()
	{
		return (("("+x+","+y+","+z+ ")"));
	}
}