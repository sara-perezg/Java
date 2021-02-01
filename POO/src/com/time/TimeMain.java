package com.time;

public class TimeMain {

	public void imprimirVoid() {
		System.out.println(imprimir());
	}
	
	public String imprimir(){
		
		System.out.println("imprime");
		return "h";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time time1 = new Time(0,0,0);
//		
		time1.sumar(0,1530,0);
//		
		System.out.printf("%d:%d:%d", time1.getHora(),time1.getMin(),time1.getSeg());
		imprimirVoid();
	}

}
