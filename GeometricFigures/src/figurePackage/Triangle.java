package figurePackage;

public class Triangle extends GeometricFigure{
	private int second_value;
	
	// Constructor
	public Triangle(int first_value, int second_value) {
		super(first_value);
		this.second_value = second_value;
	}
	
	//Getters and setters
	public int getSecond_value() {
		return second_value;
	}

	public void setSecond_value(int second_value) {
		this.second_value = second_value;
	}
	
	// Overriding methods
	@Override
	public double getArea() {
		double area = (this.getValue()*this.getSecond_value())/2;
		return area;
	}
	
	@Override
	public double getPerimeter() {
		double perimeter = (2*this.getValue()) + this.getSecond_value();
		return perimeter;
	}
}
