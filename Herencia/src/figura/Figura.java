package figura;

public class Figura {
	String color;

	
	
	public Figura() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Figura(String color) {
		super();
		this.color = color;
	}
	
	
	
	@Override
	public String toString() {
		return "Figura [color=" + color + "]";
	}

	public double getArea() {
		return 0.0;
	}
	
	public double getPerimetro() {
		return 0.0;
	}
}
