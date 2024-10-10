package enterprisePackage;
import java.util.List;
import java.util.ArrayList;

//TODO: Increase Salary by 10% annually

public class Salesman extends Employee{
	private EnterpriseCar car;
	private String cellphone;
	private String sales_area;
	private List<String> clientList = new ArrayList<>();
	private double commissionPrc;
	
	// Constructors
	public Salesman(String name, String last_name, String dNI, String address, int age,
					String phone, double salary, Employee supervisor, EnterpriseCar car,
					String cellphone, String sales_area, double commissionPrc) {
		super(name, last_name, dNI, address, age, phone, salary, supervisor);
		this.car = car;
		this.cellphone = cellphone;
		this.sales_area = sales_area;
		this.commissionPrc = commissionPrc;
	}
	
	// Getters and Setters
	// --------------------------------------------------------------------------------------------
	public EnterpriseCar getCar() {
		return car;
	}

	public void setCar(EnterpriseCar car) {
		this.car = car;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getSales_area() {
		return sales_area;
	}

	public void setSales_area(String sales_area) {
		this.sales_area = sales_area;
	}

	public List<String> getClientList() {
		return clientList;
	}

	public void setClientList(List<String> clientList) {
		this.clientList = clientList;
	}

	public double getCommissionPrc() {
		return commissionPrc;
	}

	public void setCommissionPrc(double commissionPrc) {
		this.commissionPrc = commissionPrc;
	}
	// --------------------------------------------------------------------------------------------

	// List control methods
	public void addClient(String client) {
		this.clientList.add(client);
		double newSalary = this.getSalary() + (this.getSalary() * (this.commissionPrc/100));
		this.setSalary(newSalary);
	}
	
	public void removeClient(String client) {
		for(String item : clientList) {
			if(item == client) {
				clientList.remove(item);
				double newSalary = this.getSalary() - (this.getSalary() * (this.commissionPrc/100));
				this.setSalary(newSalary);
			}
		}
	}
	
	public void printList() {
		for(String client : clientList) {
			System.out.println(client);
		}
	}
	
	// Change car method
	public void newCar(EnterpriseCar car) {
		this.car = car;
		System.out.println("Car has been changed to: "+this.getCar());
	}
	
	// Overriding increase salary
	@Override
	public void increaseSalary() {
		double newSalary = this.getSalary() + (this.getSalary() * (10/100.0));
		this.setSalary(newSalary);
	}
	
	// Overriding print method
	@Override
	public void print() {
		System.out.println(this.getName()+" "+this.getLast_name()+", DNI: "+this.getDNI()+", Edad: "+this.getAge());
		System.out.println("Telefono: "+this.getPhone()+", Direccion: "+this.getAddress()+", Telefono Movil: "+this.getCellphone());
		System.out.println("Carro: "+this.getCar());
		System.out.println("Salario: "+this.getSalary()+", Porcentaje de comision: "+this.getCommissionPrc()+", Zona de ventas: "+this.getSales_area());
		System.out.println("Supervisado por: "+this.getSupervisor().getName()+" "+this.getSupervisor().getLast_name());
	}
}
