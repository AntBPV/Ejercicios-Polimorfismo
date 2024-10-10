package figurePackage;

public class Square extends GeometricFigure{
	// Constructor
	public Square(int value) {
		super(value);
	}
	
	// Overriding methods
	@Override
	public double getArea() {
		double area = Math.pow(this.getValue(), 2);
		return area;
	}
	
	@Override
	public double getPerimeter() {
		double perimeter = 4 * this.getValue();
		return perimeter;
	}
}
