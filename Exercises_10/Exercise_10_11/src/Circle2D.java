
public class Circle2D {
private double mX;
private double mY;
private double mR;
 public Circle2D() {
	this (0.0, 0.0, 1.0);
}
public Circle2D(double x, double y, double r) {
	this.mX= x;
	this.mY= y;
	this.mR = r;
	
}
public double getX() {
	return mX;
}
public double getY() {
	return mY;
}
public double getR() {
	return mR;
}
public double getArea() {
	 return Math.PI * mR * mR;
}
public double getPerimeter() {
	return 2 * Math.PI * mR;
}
public  boolean contains(double x, double y) {
	double distance =  Math.pow((Math.pow(mX-x, 2) + Math.pow(mY-y, 2)), 0.5);
	if(distance >= mR)
		return false;
	else 
		return true;
}
public  boolean contains(Circle2D circle) {
	double distance =  Math.pow((Math.pow(mX-circle.getX(), 2) + Math.pow(mY-getY(), 2)), 0.5);
	if(distance >= Math.abs(circle.mR - mR))
		return  false;
	else 
		return true;
 }
public boolean overlaps(Circle2D circle) {
	double distance =  Math.pow((Math.pow(mX-circle.getX(), 2) + Math.pow(mY-getY(), 2)), 0.5);
	if(distance != circle.getR() + mR)
		return false;
	else 
		return true;
	}
	
}


