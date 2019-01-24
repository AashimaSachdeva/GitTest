/*Author:Aashima
Version:1.0.0
Purpose: Define a class Box with the following instance variables: width, height and depth, all of type float. Create a new class BoxWeigth that extends Box to include weight as an instance variable. Write an application that tests the functionalities of both these classes.*/

class Box
{
	float height;
	float width;
	float depth;

//no argument constructor
Box()
{
	this.height=1;
	this.width=2;
	this.depth=3;
}
//all dimension specified as argument 
Box(float width,float height,float depth)
{
	this.width=width;
	this.height=height;
	this.depth=depth;
}
//set get functions

   void setValueHeight(float height)
	{
	this.height=height;
	}
	void setValueWidth(float width)
	{
	this.width=width;
	}
	void setValueDepth(float depth)
	{
	this.depth=depth;
	}
   float getValueHeight()
	{
	return height;
	}
	float getValueWidth()
	{
	return width;
	}
	float getValueDepth()
	{
	return depth;
	}
	
//display volume
   void displayVolume()
   {  
	float Volume=height*width*depth;
	System.out.print("volume"+Volume);
   }
}