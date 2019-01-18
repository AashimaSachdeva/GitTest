import java.util.*;
class StaticDistanceTest{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of feet1: ");
		float f1 = scan.nextFloat();
		System.out.println("Enter the value of inch1: ");
		float i1 = scan.nextFloat();
		System.out.println("Enter the value of feet2: ");
		float f2 = scan.nextFloat();
		System.out.println("Enter the value of inch2: ");
		float i2 = scan.nextFloat();
		
		StaticDistance d1 = new StaticDistance(f1,i1);
		StaticDistance d2 = new StaticDistance(f2 ,i2);
		StaticDistance d3 = StaticDistance.sum(d1,d2);
		System.out.println(d3.getvaluef());
		System.out.println(d3.getvaluei());


        }
    }