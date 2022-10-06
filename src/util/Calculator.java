package util;

public class Calculator {
	public final double PI = 3.1459;
	

	public double circumference(double radius) {
		return 2.0 * PI * radius;
		
	}
	
	public double volume(double radius) {
		return 4.0 * PI * Math.pow(radius, 3.0) / 3.0;
	

}

	
}
