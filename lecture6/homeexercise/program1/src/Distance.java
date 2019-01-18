/* Author : Aashima
Version : 1.0.0
Purpose :1.	Write a program to read two distances in feet and inches and find their sum. */
import java.util.*;
class Distance
{
	float feet;
	float inch;
	float f;
	float i;
	Distance()
	{
		this.feet=0;
		this.inch=0;

	}
	Distance(float f , float i)
	{
		this.feet=f;
		this.inch=i;
	}
	void getDistance(){
		this.feet = f;
		this.inch = i;
	}

	void setDistance(float f , float i)
	{
		feet =f;
		inch =i;
	}
	void setDistance(){
		System.out.println("entered distance is "+ feet +" feet " +inch+" inches ");
	}
	void sum(Distance d){
		float sumfeet = this.feet + d.feet;
		float suminch = this.inch + d.inch + (inch/12);
		inch = inch%12;

		System.out.println(" total distance is "+ sumfeet + " feet " + suminch +"inches");
	}
}
