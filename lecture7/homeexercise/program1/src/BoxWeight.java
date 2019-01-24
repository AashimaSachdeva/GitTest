class BoxWeight extends Box
{

float weight;
//constructor with no argument
//using super to call base class
 BoxWeight()
	{   super();
		this.weight=1;
	}
	//all dimensions specified as arguments
	//using super to call base class
 BoxWeight(float height,float width,float depth,float weight)
	{
		super(height,width,depth);
		this.width=width;
	}

	void setWeight(float weight)
	{
		this.weight=weight;
	}

   float getWeight()
	{
		return height;

	}
void displayWeight()
{
	System.out.print("weight="+weight);
}
	
	}

	