package isf;

public class Cuenta {
	
	private double saldo;
	
	public Cuenta()	{
		saldo=0.0; 
	}
	public Cuenta(double valor)	{ 
		saldo=valor; 
	}
	//* getsaldo retorna el saldo
	public double getSaldo(){ 
		return saldo; 
	}
	//* pone el saldo en la cuenta
	public void setSaldo(double valor){ 
		saldo = valor; 
	}
	//* operación propia de la clase cuenta
	public void reintegro(double valor){ 
		saldo = saldo - valor; 
	}
	//* operación propia de la clase cuenta
	public void ingreso(double valor){
		saldo = saldo + valor; 
	}

}
