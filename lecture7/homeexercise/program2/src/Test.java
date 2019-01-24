/*class Test
{
	public static void main(String args[])
	{
		Point3D p1=new Point3D();
		System.out.println("x"+p1.getValuex());
		System.out.println("y"+p1.getValuey());
		System.out.println("z"+p1.getValuez());
		p1.setxyz(x,y,z);
		System.out.print(p1.toString());		

	}

}*/
import java.util.*;
class Test{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" enterr the value of x");
		float x = scan.nextFloat();
		System.out.println(" enterr the value of y");
		float y = scan.nextFloat();
		System.out.println(" enterr the value of z");
		float z = scan.nextFloat();

		Point3D p = new Point3D();
		p.setValuexyz(x,y,z);
		System.out.println(p.toString());

	}
}