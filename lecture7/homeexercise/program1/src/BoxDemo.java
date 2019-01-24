class BoxDemo
{
	public static void main(String args[])
	{
		BoxWeight b1=new BoxWeight();
		System.out.println("height"+b1.getValueHeight());
		System.out.println("depth"+b1.getValueWidth());
		System.out.println("width"+b1.getValueDepth());
		b1.displayVolume();
		System.out.println("weight"+b1.getWeight());


	}

}