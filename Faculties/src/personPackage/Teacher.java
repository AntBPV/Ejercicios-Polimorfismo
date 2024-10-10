package personPackage;

public class Teacher extends Employee{
	private String area;
	
	// Constructor
	public Teacher(String name, String last_name, String DNI, int choice,
					int incorporationYear, int officeNumber, String area) {
		super(name, last_name, DNI, choice, incorporationYear, officeNumber);
		this.area = area;
	}
	
	// Getters and Setters
	// -------------------------------------------------------------
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	// -------------------------------------------------------------
	
	// Change area method
	public void changeArea(String area) {
		this.area = area;
		System.out.println("Area del profesor ha cambiado a: "+area);
	}
	
	// toString method
	@Override
	public String toString() {
		return "Teacher [area=" + area + ", getIncorporationYear()=" + getIncorporationYear() + ", getOfficeNumber()="
				+ getOfficeNumber() + ", getName()=" + getName() + ", getLast_name()=" + getLast_name() + ", getDNI()="
				+ getDNI() + ", getCivil_state()=" + getCivil_state() + "]";
	}
	
	// Overriding print method
	@Override
	public void print() {
		System.out.println("Nombre del profesor: "+this.getName()+" "+this.getLast_name()+", DNI: "+this.getDNI());
		System.out.println("Estado civil: "+this.getCivil_state());
		System.out.println("Año en el que se incoporo: "+this.getIncorporationYear());
		System.out.println("Numero de oficina: "+this.getOfficeNumber()+", Area: "+this.getArea());
	}
}
