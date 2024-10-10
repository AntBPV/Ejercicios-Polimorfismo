package figurePackage;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor ingrese el radio del circulo: ");
		int radius = scanner.nextInt();
		Circle circle = new Circle(radius);
		System.out.println("Area del circulo: "+circle.getArea());
		System.out.println("Perimetro del circulo: "+circle.getPerimeter());
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("");
		System.out.println("Ingrese el lado del cuadrado: ");
		int squareSide = scanner.nextInt();
		Square square = new Square(squareSide);
		System.out.println("Area del cuadrado: "+square.getArea());
		System.out.println("Perimetro del cuadrado: "+square.getPerimeter());
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("");
		System.out.println("Ingrese el lado del cubo: ");
		int cubeSide = scanner.nextInt();
		Cube cube = new Cube(cubeSide);
		System.out.println("Area del cubo: "+cube.getArea());
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("");
		System.out.println("Ingrese la longitud del rectangulo: ");
		int rectangleLenght = scanner.nextInt();
		System.out.println("Ingrese la anchura del rectangulo: ");
		int rectangleWidth = scanner.nextInt();
		Rectangle rectangle = new Rectangle(rectangleLenght, rectangleWidth);
		System.out.println("Area del rectangulo: "+rectangle.getArea());
		System.out.println("Perimetro del rectangulo: "+rectangle.getPerimeter());
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("");
		System.out.println("Ingrese la longitud del triangulo: ");
		int triangleLenght = scanner.nextInt();
		System.out.println("Ingrese la anchura del triangulo: ");
		int triangleWidth = scanner.nextInt();
		Triangle triangle = new Triangle(triangleLenght, triangleWidth);
		System.out.println("Area del rectangulo: "+triangle.getArea());
		System.out.println("Perimetro del rectangulo: "+triangle.getPerimeter());
		
		scanner.close();
	}

}
