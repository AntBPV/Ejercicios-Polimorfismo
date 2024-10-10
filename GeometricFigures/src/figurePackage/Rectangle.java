package figurePackage;

public class Rectangle extends GeometricFigure{
	private int second_value;
	
	// Constructor
	public Rectangle(int first_value, int second_value) {
		super(first_value);
		this.second_value = second_value;
	}

	// Getters and Setters
	public int getSecond_value() {
		return second_value;
	}

	public void setSecond_value(int second_value) {
		this.second_value = second_value;
	}
	
	// Overriding Methods
	@Override
	public double getArea() {
		double area = this.getValue() * this.getSecond_value();
		return area;
	}
	
	@Override
	public double getPerimeter() {
		double perimeter = (2*this.getValue()) + (2*this.getSecond_value());
		return perimeter;
	}
}
