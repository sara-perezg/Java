package figura;

public class Rectangulo extends Figura {
	double lado1;
	double lado2;
	
	public Rectangulo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rectangulo(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}
	
	public Rectangulo(String color,double lado1, double lado2) {
		super(color);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	
	
	@Override
	public String toString() {
		return "Rectangulo [lado1=" + lado1 + ", lado2=" + lado2 + ", getArea()=" + getArea() + ", getPerimetro()="
				+ getPerimetro() + ", toString()=" + super.toString() + "]";
	}
	@Override
	public double getArea() {
		return lado1*lado2;
	}
	
	@Override
	public double getPerimetro() {
		return lado1*2+lado2*2;
	}
}
