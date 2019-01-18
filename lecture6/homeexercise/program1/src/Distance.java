class Distance
{
	private float f;//f = feeti =inch
	private float i;
	
	Distance()
	{
	this.f=0;
	this.i=0;
	}

	Distance(float f,float i)
	{
	this.f=f;
	this.i=i;
	}
	void setValuex(float f)
	{
	this.f=f;
	}
	void setValuey(float i)
	{
	this.i=i;
	}
	float getValuef()
	{
	return f;
	}
	float getValuei()
	{
	return i;
	}
	void sum(Distance d1, Distance d2)
	{
		float sumf = d1.f + d2.f;
		float sumi = d1.i + d2.i + (i/12);
		i = i%12;
        System.out.println(" total distance is "+ sumf+ " feet " + sumi +"inches");
	}
}