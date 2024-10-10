package enterprisePackage;

public class Program {

	public static void main(String[] args) {
		// Instance all required classes
		Secretary secretary = new Secretary("Alfonso", "Gutierrez", "27813", "Manizales", 22,
												"316 xyz", 3250100.25, null, "Oficina 114", "Numero fax X");
		
		EnterpriseCar salesmanCar = new EnterpriseCar("XYZ-GEI", "Toyota", 2019);
		Salesman saleman_1 = new Salesman("Ramon", "Guerrero", "63712", "Santiago", 26,
											"315 xyz", 3700010.20, null, salesmanCar, "320 xyz",
											"San andres", 15.5);
		Salesman saleman_2 = new Salesman("Simon", "Fernandez", "21736", "Mariluz", 24,
											"314 xyz", 3700010.25, null, salesmanCar, "316 xyz",
											"Morasurco", 17.0);
		
		EnterpriseCar chiefCar = new EnterpriseCar("XYZ-OSO", "Honda", 2022);
		ZoneChief chief = new ZoneChief("Roberto", "Alende", "23172", "La colina", 36,
										"313 xyz", 4050100.50, null, "Oficina 303", secretary, chiefCar);
		
		// Setting up classes
		secretary.setSupervisor(chief);
		System.out.println("Secretario: ");
		secretary.print();
		System.out.println("");
		System.out.println("-----------------------------------------------------------");
		System.out.println("");
		
		saleman_1.setSupervisor(chief);
		saleman_1.addClient("Jhon Cliente");
		saleman_1.addClient("Luis Cliente");
		System.out.println("Vendedor 1: ");
		saleman_1.print();
		System.out.println("Lista de clientes: ");
		saleman_1.printList();
		System.out.println("");
		System.out.println("-----------------------------------------------------------");
		System.out.println("");
		
		saleman_2.setSupervisor(chief);
		saleman_2.addClient("Jhon Cliente");
		saleman_2.addClient("Luis Cliente");
		saleman_2.addClient("Jesus Cliente");
		System.out.println("Vendedor 2: ");
		saleman_2.print();
		System.out.println("Lista de clientes: ");
		saleman_2.printList();
		System.out.println("");
		System.out.println("-----------------------------------------------------------");
		System.out.println("");
		
		
		chief.addSalesman(saleman_1);
		chief.addSalesman(saleman_2);
		System.out.println("Jefe de zona: ");
		chief.print();
		System.out.println("Lista de vendedores: ");
		chief.printList();
		System.out.println("");
		System.out.println("-----------------------------------------------------------");
		System.out.println("");
		
		System.out.println("Fin de Año!!");
		System.out.println("Aumentando los salarios...");
		secretary.increaseSalary();
		saleman_1.increaseSalary();
		saleman_2.increaseSalary();
		chief.increaseSalary();
		secretary.print();
		System.out.println("-----------------------------------------------------------");
		saleman_1.print();
		System.out.println("-----------------------------------------------------------");
		saleman_2.print();
		System.out.println("-----------------------------------------------------------");
		chief.print();
	}

}
