package figurePackage;

public class Cube extends Square{
	// Constructor
	public Cube(int value) {
		super(value);
	}
	
	// Overriding methods
	@Override
	public double getArea() {
		double area = 6 * Math.pow(this.getValue(), 2);
		return area;
	}
}
