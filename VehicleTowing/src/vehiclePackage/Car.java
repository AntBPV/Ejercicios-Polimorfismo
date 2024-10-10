package vehiclePackage;

public class Car extends Vehicle{
	private int doors;
	
	// Constructors
	public Car(String plate, int doors) {
		super(plate);
		this.doors = doors;
	}
	
	// Getters and Setters
	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	@Override
	public String toString() {
		return "Car [doors=" + doors + ", plate=" + plate + ", speed=" + speed + "]";
	}

	
	
}
