package vehiclePackage;

public class Tow {
	private int weight;
	
	// Constructor
	public Tow(int weight) {
		this.weight = weight;
	}
	
	// Getters and Setters
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Tow [weight=" + weight + "]";
	}
}
