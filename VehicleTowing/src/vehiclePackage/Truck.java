package vehiclePackage;

public class Truck extends Vehicle{
	private Tow tow;
	
	public Truck(String plate) {
		super(plate);
		this.tow = null;
	}
	
	// Getters and Setters
	public Tow getTowel() {
		return tow;
	}

	public void setTow(Tow towel) {
		this.tow = towel;
	}
		// Extra method to remove tow
	public void removeTow() {
		this.tow = null;
	}
	
	// Overriding methods
	@Override
	public double accelerate(double acceleration) {
		double newSpeed = this.getSpeed() + acceleration;
		this.setSpeed(acceleration);
		if(newSpeed > 100.0) {
			System.out.println("Truck is going too fast!!");
		}
		return this.getSpeed();
	}

	@Override
	public String toString() {
		return "Truck [towel=" + tow + ", plate=" + plate + ", speed=" + speed + "]";
	}
	
}
