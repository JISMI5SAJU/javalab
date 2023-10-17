package javaprograms;
import java.util.Scanner;
public class overloading {
	public static void main(String[]args) {
		int length,breadth;
		float height,base,radius;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length and breadth of the rectangle");
		length=sc.nextInt();
		breadth=sc.nextInt();
		System.out.println("Enter height and base of triangle");
		height=sc.nextFloat();
		base=sc.nextFloat();
		System.out.println("Enter radius of circle");
		radius=sc.nextFloat();
		shape area1=new shape();
		area1.area(length,breadth);
		area1.area(base,height);
		area1.area(radius);
		
	}
		
	}
	class shape{
		public void area(int length,int breadth) {
			System.out.println("Area of rectangle="+(length*breadth));
		}
		public void area(float base,float height) {
			System.out.println("Area of triangle="+(0.5*base*height));
		}
		public void area(float radius) {
			System.out.println("Area of circle="+3.14*radius*radius);
		}

				
		
	}


