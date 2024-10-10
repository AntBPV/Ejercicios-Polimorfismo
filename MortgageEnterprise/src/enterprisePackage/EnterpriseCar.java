package enterprisePackage;

public class EnterpriseCar {
	private String plate;
	private String brand;
	private int model;
	
	// Constructor
	public EnterpriseCar(String plate, String brand, int model) {
		this.plate = plate;
		this.brand = brand;
		this.model = model;
	}
	
	// Getters and Setters
	// --------------------------------------------------------------------------------------------
	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}
	// --------------------------------------------------------------------------------------------

	// toString method
	@Override
	public String toString() {
		return "EnterpriseCar [plate=" + plate + ", brand=" + brand + ", model=" + model + "]";
	}
}
