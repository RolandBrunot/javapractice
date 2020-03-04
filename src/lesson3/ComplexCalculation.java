package lesson3;

class Complex {
	private double real;
	private double image;

	public Complex(double real, double image) {
		this.image = image;
		this.real = real;
	}

	public void SetReal(double real) {
		this.real = real;
	}

	public void SetImage(double image) {
		this.image = image;
	}

	public void print() {
		System.out.println(real + "+" + image + "i");
	}

	public void Addition(double real, double image) {
		this.real += real;
		this.image += image;
	}

	public void Subtraction(double real, double image) {
		this.real -= real;
		this.image -= image;
	}

	public void Addition(Complex a) {
		Complex temp = new Complex(0, 0);
		temp.real = real + a.real;
		temp.image = image + a.image;
		temp.print();
	}

	public void Subtraction(Complex a) {
		Complex temp = new Complex(0, 0);
		temp.real = real - a.real;
		temp.image = image - a.image;
		temp.print();
	}
}

public class ComplexCalculation {
	public static void main(String[] args) {
		Complex a1 = new Complex(2, 4);
		Complex a2 = new Complex(3, 5);
		a1.Addition(a2);
		a1.print();
		a1.Addition(4, 7);
		a1.print();
	}
}