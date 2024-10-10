package personPackage;

public class Person {
	private String name;
	private String last_name;
	private String DNI;
	private String civil_state;
	
	// Constructor
	public Person(String name, String last_name, String DNI, int choice) {
		this.name = name;
		this.last_name = last_name;
		this.DNI = DNI;
		switch(choice) {
		case 1:
			this.civil_state = "Soltero/a";
			break;
		case 2:
			this.civil_state = "Casado/a";
			break;
		case 3:
			this.civil_state = "Divorciado/a";
			break;
		case 4:
			this.civil_state = "Viudo/a";
			break;
		default:
			this.civil_state = "Soltero/a";
			break;
		}
	}
	
	// Getters and Setters
	// ----------------------------------------------------------------------------------
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getCivil_state() {
		return civil_state;
	}

	public void setCivil_state(String civil_state) {
		this.civil_state = civil_state;
	}
	// ----------------------------------------------------------------------------------
	
	// toString method
	@Override
	public String toString() {
		return "Person [name=" + name + ", last_name=" + last_name + ", DNI=" + DNI + ", civil_state=" + civil_state
				+ "]";
	}
	
	// Change civil state by switch method
	public void changeCivilState(int choice) {
		switch(choice) {
		case 1:
			this.civil_state = "Soltero/a";
			break;
		case 2:
			this.civil_state = "Casado/a";
			break;
		case 3:
			this.civil_state = "Divorciado/a";
			break;
		case 4:
			this.civil_state = "Viudo/a";
			break;
		default:
			this.civil_state = "Soltero/a";
			break;
		}
	}
	
	// Print method
	public void print() {
		System.out.println("Nombre: "+this.getName()+" "+this.getLast_name()+", DNI: "+this.getDNI());
		System.out.println("Estado civil: "+this.getCivil_state());
	}
}