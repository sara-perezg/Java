package islasf;

public class MiMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alumno xiang = new Alumno();
		Alumno luna = new Alumno(0001, "Luna", "Puchol");
		Alumno miguel = new Alumno(0002, "Miguel", "Fdez");
		
		System.out.println(xiang.toString());
		System.out.println(luna.toString());
		System.out.println(miguel.toString());
		
		miguel.setApellido("Garcia");
		
		System.out.println(miguel.toString());
		System.out.printf("El numero de expediente de %s es %d", luna.getNombre(), luna.getnExp());
		
	}

}
