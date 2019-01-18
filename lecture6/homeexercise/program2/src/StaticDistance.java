/* Author : Aashima
Version : 1.0.0
Purpose :1.	Write a program to read two distances in feet and inches and find their sum with static
 method defination */
class StaticDistance{
	static float f;//f=feet   i=inch
	static float i;

	StaticDistance(){
		this.f=0;
		this.i=0;

	}
	StaticDistance(float f, float i){
		this.f=f;
		this.i=i;
	}

	void setvaluefeet(float f){
		this.f = f;
	}
	void setvalueinch(float i){
		this.i = i;
	}
	 float getvaluef(){
	 	return f;
	 }
	 float getvaluei(){
	 	return i;
    }
	
	static StaticDistance sum(StaticDistance d1 , StaticDistance d2){
		
		float i = d1.i + d2.i;
		float f = d1.f + d2.f;
		StaticDistance d = new StaticDistance(i,f);
		return d; 
	}



}
