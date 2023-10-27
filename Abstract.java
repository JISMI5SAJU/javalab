package javaprograms;

public class Abstract {
	 public static void main(String[] args) {
     Rectangle rectangle =new Rectangle();
     rectangle.numberOfsides();
     Triangle triangle=new Triangle();
     triangle.numberOfsides();
     Hexagon hexagon=new Hexagon();
     hexagon.numberOfsides();
     
	 }
}
 abstract class Shape
 {
	 public void numberOfsides() {}{
	 }
 }
 class Rectangle extends Shape{
	 public void numberOfsides() {}{
		 System.out.println("No of sides of rectangle are 4");
	 }
 }
 class Triangle extends Shape{
	 public void numberOfsides() {}{
		 System.out.println("No of sides of triangle are 3 ");

	 }
 }
 class Hexagon extends Shape{
	 public void numberOfsides() {}{
		 System.out.println("No of sides of hexagon are 6");
	 }
 }