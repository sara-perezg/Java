package figura;

public class Triangulo extends Figura {
	double base,altura,l1,l2,l3;
	
	public Triangulo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Triangulo(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	public Triangulo(String color, double base, double altura, double l1, double l2, double l3) {
		super(color);
		this.base = base;
		this.altura = altura;
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
	}

	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + ", l1=" + l1 + ", l2=" + l2 + ", l3=" + l3
				+ ", getArea()=" + getArea() + ", getPerimetro()=" + getPerimetro() + ", toString()=" + super.toString()
				+ "]";
	}
	@Override
	public double getArea() {
		double area = base*altura;
		return area;
	}
	
	@Override
	public double getPerimetro() {
		double perimetro = l1+l2+l3; //asumo que es isosceles
		return perimetro;
	}
}
