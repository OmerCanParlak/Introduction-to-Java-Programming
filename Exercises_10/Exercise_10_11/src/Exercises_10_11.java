

public class Exercises_10_11 {
	public static void main(String[] args) {
Circle2D c1 = new Circle2D(2 , 2, 5.5);
System.out.printf("Circel1 area is %.2f and primater is %.2f\n" ,c1.getArea(), c1.getPerimeter());
System.out.println("Is Point (3,3) inside circle1?   It is " + c1.contains(3,3));
System.out.println("Is Circle (4, 5, 10.5) inside circel1? It is " + c1.contains(new Circle2D(4,5,2.3)));
System.out.println("Is Circle (3, 5, 2.3) overlaps with circel1, It is " + c1.overlaps(new Circle2D(3, 5, 2.3)));
Circle2D c2 = new Circle2D();
System.out.println(c2.getArea());

	}
}
