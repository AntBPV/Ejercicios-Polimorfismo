package enterprisePackage;

// TODO: Create attribute Supervisor with its methods

public class Employee {
	private String name;
	private String last_name;
	private String DNI;
	private String address;
	private int age;
	private String phone;
	protected double salary;
	protected Employee supervisor;
	
	// Constructor	
	public Employee(String name, String last_name, String dNI, String address, int age,
						String phone, double salary, Employee supervisor) {
		this.name = name;
		this.last_name = last_name;
		this.DNI = dNI;
		this.address = address;
		this.age = age;
		this.phone = phone;
		this.salary = salary;
		this.supervisor = supervisor;
	}

	// Getters and Setters
	// --------------------------------------------------------------------------------------------
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Employee getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Employee supervisor) {
		this.supervisor = supervisor;
	}
	// --------------------------------------------------------------------------------------------

	// Increase salary multiplies existing salary for a percentage
	public void increaseSalary() {
		double newSalary = this.getSalary() + (this.getSalary() * (1/100.0));
		this.setSalary(newSalary);
	}
	
	// Print method
	public void print() {
		System.out.println(this.getName()+" "+this.getLast_name()+", DNI: "+this.getDNI()+", Edad: "+this.getAge());
		System.out.println("Telefono: "+this.getPhone()+", Direccion: "+this.getAddress());
		System.out.println("Salario: "+this.getSalary());
		System.out.println("Supervisado por: "+this.getSupervisor().getName()+" "+this.getSupervisor().getLast_name());
	}
	
	// toString method
	@Override
	public String toString() {
		return "Employee [name=" + name + ", last_name=" + last_name + ", DNI=" + DNI + ", address=" + address
				+ ", age=" + age + ", phone=" + phone + ", salary=" + salary + "]";
	}
	
}
