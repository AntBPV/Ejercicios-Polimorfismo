package figurePackage;

public class Circle extends GeometricFigure{
	// Constructor
	public Circle(int value) {
		super(value);
	}
	
	// Overriding methods
	@Override
	public double getArea() {
		double area = Math.PI * Math.pow(this.getValue(), 2);
		return area;
	}
	
	@Override
	public double getPerimeter() {
		double perimeter = 2 * Math.PI * this.getValue();
		return perimeter;
	}
}
