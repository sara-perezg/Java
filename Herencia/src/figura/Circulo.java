package figura;

public class Circulo extends Figura {
	double radio;

	public Circulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circulo(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", getArea()=" + getArea() + ", getPerimetro()=" + getPerimetro()
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public double getArea() {
		return Math.PI*Math.pow(radio,2);
	}
	
	@Override
	public double getPerimetro() {
		return Math.PI*radio*2;
	}
	
}
