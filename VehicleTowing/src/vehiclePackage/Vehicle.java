package vehiclePackage;

public class Vehicle {
	protected String plate;
	protected double speed;
	
	// Constructor
	public Vehicle(String plate) {
		this.plate = plate;
		this.speed = 0;
	}
	
	// Getters and Setters
	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	// toString method
	@Override
	public String toString() {
		return "Vehicle [plate=" + plate + ", speed=" + speed + "]";
	}
	
	// Adding acceleration to speed of vehicle
	public double accelerate(double acceleration) {
		this.speed = this.speed + acceleration;
		return this.speed;
	}
}
