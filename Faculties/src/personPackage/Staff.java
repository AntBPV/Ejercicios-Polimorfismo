package personPackage;

public class Staff extends Employee{
	private String section;
	
	// Constructor
	public Staff(String name, String last_name, String DNI, int choice,
					int incorporationYear, int officeNumber, String section) {
		super(name, last_name, DNI, choice, incorporationYear, officeNumber);
		this.section = section;
	}
	
	// Getters and Setters
	// ---------------------------------------------------------------------
	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}
	// ---------------------------------------------------------------------
	
	// Change section method
	public void changeSection(String section) {
		this.section = section;
		System.out.println("Seccion del staff ha cambiad a: "+section);
	}

	// toString method
	@Override
	public String toString() {
		return "Staff [section=" + section + ", getIncorporationYear()=" + getIncorporationYear()
				+ ", getOfficeNumber()=" + getOfficeNumber() + ", getName()=" + getName() + ", getLast_name()="
				+ getLast_name() + ", getDNI()=" + getDNI() + ", getCivil_state()=" + getCivil_state() + "]";
	}

	// Overriding print method
	@Override
	public void print() {
		System.out.println("Nombre del staff: "+this.getName()+" "+this.getLast_name()+", DNI: "+this.getDNI());
		System.out.println("Estado civil: "+this.getCivil_state());
		System.out.println("Año en el que se incoporo: "+this.getIncorporationYear());
		System.out.println("Numero de oficina: "+this.getOfficeNumber()+", Seccion: "+this.getSection());
	}
}
