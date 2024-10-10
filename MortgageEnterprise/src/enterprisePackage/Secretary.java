package enterprisePackage;

public class Secretary extends Employee{
	private String office;
	private String fax;
	
	public Secretary(String name, String last_name, String dNI, String address, int age,
						String phone, double salary, Employee supervisor, String office, String fax) {
		super(name, last_name, dNI, address, age, phone, salary, supervisor);
		this.office = office;
		this.fax = fax;
	}
	
	// Getters and Setters
	// --------------------------------------------------------------------------------------------
	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}
	// --------------------------------------------------------------------------------------------
	
	// Overriding increase salary
	@Override
	public void increaseSalary() {
		double newSalary = this.getSalary() + (this.getSalary() * (5/100.0));
		this.setSalary(newSalary);
	}
	
	// Overriding print method
	@Override
	public void print() {
		System.out.println(this.getName()+" "+this.getLast_name()+", DNI: "+this.getDNI()+", Edad: "+this.getAge());
		System.out.println("Telefono: "+this.getPhone()+", Direccion: "+this.getAddress()+", Numero Fax: "+this.getFax());
		System.out.println("Oficina del Secretario: "+this.getOffice());
		System.out.println("Salario: "+this.getSalary());
		System.out.println("Supervisado por: "+this.getSupervisor().getName()+" "+this.getSupervisor().getLast_name());
	}
}
