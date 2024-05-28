package entities;

public class Rectangle {
	
	//atributos
	public double width;
	public double heigth;
	public double hipotenusa;
	
	//métodos
	public double area() {
		return width * heigth;
	}
	public double perimeter() {
		return width * 2 + heigth * 2;
	}
	public double diagonal() {
		return Math.sqrt(width * width + heigth * heigth);
	}		
		
}
