package vehiclePackage;

public class Program {

	public static void main(String[] args) {
		Car car = new Car("343",4);
		
		System.out.println(car);
		car.accelerate(5);
		System.out.println(car);
		
		Tow tow = new Tow(25);
		Truck truck = new Truck("GEI");
		System.out.println(truck);
		truck.setTow(tow);
		truck.accelerate(90);
		System.out.println(truck);
		truck.accelerate(20);
	}

}
