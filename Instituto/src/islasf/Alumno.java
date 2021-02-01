package islasf;

public class Alumno {

//	atributos
	private int nExp;
	private String nombre;
	private String apellido;
	
//	constructores
	
	public Alumno() {
		
	}
	
	public Alumno(int nExp, String nombre, String apellido) {
		this.nExp = nExp;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
//	getter y setters
	public int getnExp() {
		return nExp;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}

	public void setnExp(int nExp) {
		this.nExp = nExp;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
//	el toString
	@Override
	public String toString() {
		return "Alumno [nExp=" + nExp + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
}
