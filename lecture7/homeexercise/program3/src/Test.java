import java.util.*;
class Test
{
	public static void main(String[] args)
	{
		Shape s = new Shape();
		System.out.println("Shape: "+"\t"+"\t"+s.toString());

		Rectangle r = new Rectangle(1.0 ,1.0);
		System.out.println("Rectangle: "+"\t"+"\t"+r.toString());

		Square sq = new Square(1.0);
		System.out.println("Square: "+"\t"+"\t"+sq.toString());

        Circle c = new Circle(1.0);
		System.out.println("Circle: "+"\t"+"\t"+c.toString());
	


	

	}
}