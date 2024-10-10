package enterprisePackage;
import java.util.List;
import java.util.ArrayList;

//TODO: Increase Salary by 20% annually

public class ZoneChief extends Employee{
	private String office;
	private Secretary secretary;
	private List<Salesman> SalesmanList = new ArrayList<>();
	private EnterpriseCar car;
	
	public ZoneChief(String name, String last_name, String dNI, String address, int age,
						String phone, double salary, Employee supervisor,String office, Secretary secretary, EnterpriseCar car) {
		super(name, last_name, dNI, address, age, phone, salary, supervisor);
		this.office = office;
		this.secretary = secretary;
		this.car = car;
	}
	
	// Getters and Setters
	// --------------------------------------------------------------------------------------------
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public Secretary getSecretary() {
		return secretary;
	}
	public void setSecretary(Secretary secretary) {
		this.secretary = secretary;
	}
	public List<Salesman> getSalesmanList() {
		return SalesmanList;
	}
	public void setSalesmanList(List<Salesman> salesmanList) {
		SalesmanList = salesmanList;
	}
	public EnterpriseCar getCar() {
		return car;
	}
	public void setCar(EnterpriseCar car) {
		this.car = car;
	}
	// --------------------------------------------------------------------------------------------

	// List control methods
	public void addSalesman(Salesman salesman) {
		this.SalesmanList.add(salesman);
	}
	
	public void removeSalesman(Salesman salesman) {
		for(Salesman item : SalesmanList) {
			if(item == salesman) {
				SalesmanList.remove(item);
			}
		}
	}
	
	public void printList() {
		for(Salesman salesman :	SalesmanList) {
			salesman.print();
			System.out.println("-----------------------------------------------");
		}
	}
	
	// Change secretary method
	public void newSecretary(Secretary secretary) {
		this.secretary = secretary;
		secretary.print();
	}
	
	// Change car method
	public void newCar(EnterpriseCar car) {
		this.car = car;
		System.out.println("Car has been changed to: "+this.getCar());
	}
	
	// Overriding increase salary
	@Override
	public void increaseSalary() {
		double newSalary = this.getSalary() + (this.getSalary() * (20/100.0));
		this.setSalary(newSalary);
	}
	
	// Overriding Print method
	@Override
	public void print() {
		System.out.println(this.getName()+" "+this.getLast_name()+", DNI: "+this.getDNI()+", Edad: "+this.getAge());
		System.out.println("Telefono: "+this.getPhone()+", Direccion: "+this.getAddress()+", Oficina: "+this.getOffice());
		System.out.println("Carro: "+this.getCar());
		System.out.println("Salario: "+this.getSalary());
	}
}
