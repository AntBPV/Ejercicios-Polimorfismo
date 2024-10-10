package personPackage;

public class Employee extends Person{
	private int incorporationYear;
	private int officeNumber;
	
	// Constructor
	public Employee(String name, String last_name, String DNI, int choice,
					int incorporationYear, int officeNumber) {
		super(name, last_name, DNI, choice);
		this.incorporationYear = incorporationYear;
		this.officeNumber = officeNumber;
	}
	
	// Getters and Setters
	// ------------------------------------------------------------------------------
	public int getIncorporationYear() {
		return incorporationYear;
	}

	public void setIncorporationYear(int incorporationYear) {
		this.incorporationYear = incorporationYear;
	}

	public int getOfficeNumber() {
		return officeNumber;
	}

	public void setOfficeNumber(int officeNumber) {
		this.officeNumber = officeNumber;
	}
	// ------------------------------------------------------------------------------
	
	// toString method
	@Override
	public String toString() {
		return "Employee [incorporationYear=" + incorporationYear + ", officeNumber=" + officeNumber + ", getName()="
				+ getName() + ", getLast_name()=" + getLast_name() + ", getDNI()=" + getDNI() + ", getCivil_state()="
				+ getCivil_state() + "]";
	}
	
	// reassign office method
	public void reassignOffice(int officeNumber) {
		this.officeNumber = officeNumber;
		System.out.println("Numero de oficina ha cambiado a: "+officeNumber);
	}
	
	// Overriding print method
	@Override
	public void print() {
		System.out.println("Nombre del empleado: "+this.getName()+" "+this.getLast_name()+", DNI: "+this.getDNI());
		System.out.println("Estado civil: "+this.getCivil_state());
		System.out.println("Año en el que se incoporo: "+this.getIncorporationYear()+", Numero de oficina: "+this.getOfficeNumber());
	}
}
