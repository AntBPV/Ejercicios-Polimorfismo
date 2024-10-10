package personPackage;

public class Student extends Person{
	private String course;
	
	// Constructor
	public Student(String name, String last_name, String DNI, int choice, String course) {
		super(name, last_name, DNI, choice);
		this.course = course;
	}
	
	// Getters and Setters
	// -------------------------------------------------
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	// -------------------------------------------------
	
	// toString method
	@Override
	public String toString() {
		return "Student [course=" + course + ", getName()=" + getName() + ", getLast_name()=" + getLast_name()
				+ ", getDNI()=" + getDNI() + ", getCivil_state()=" + getCivil_state() + "]";
	}
	
	// Changing course
	public void newCourse(String course) {
		this.course = course;
		System.out.println("Curso cambiado a: "+course);
	}
	
	// Overriding print method
	@Override
	public void print() {
		System.out.println("Nombre del estudiante: "+this.getName()+" "+this.getLast_name()+", DNI: "+this.getDNI());
		System.out.println("Estado civil: "+this.getCivil_state());
		System.out.println("Curso Matriculado: "+this.getCourse());
	}
}
