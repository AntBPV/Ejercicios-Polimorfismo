package figurePackage;

public class GeometricFigure {
	private int value;
	
	// Constructors
	public GeometricFigure(int value) {
		this.value = value;
	}
	
	// Getters and Setters
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	// Required Methods
	public double getArea() {
		return 1.0;
	}
	public double getPerimeter() {
		return 1.0;
	}
}
