package personPackage;

public class Program {

	public static void main(String[] args) {
		Student student = new Student("Ramiro", "Andrade", "47657", 1, "Bellas artes");
		student.print();
		
		Teacher teacher = new Teacher("Camilo", "Toro", "23651", 3, 2022, 314, "Ingenieria");
		teacher.print();
		
		Staff staff = new Staff("Tomas", "Lopez", "12353", 2, 2020, 102, "Tesoreria");
		staff.print();
		
		System.out.println("Cambiando valores...");
		student.changeCivilState(2);
		student.newCourse("Artes plasticas");
		student.print();
		
		teacher.changeArea("Calculo");
		teacher.print();
		
		staff.changeSection("Rectoria");
		staff.print();
	}

}
