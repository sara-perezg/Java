package com.time;

public class Time {
	private int hora;
	private int min;
	private int seg;
	
	public Time() {}
	
	public Time(int hora, int min, int seg) {
		this.hora = hora;
		this.min = min;
		this.seg = seg;			
	}
	
	public void setHora(int hora) {
		this.hora = hora;
	}
	
	public int getHora() {
		return hora;
	}
	public void setMin(int min) {
		this.min = min;

	}
	public int getMin() {
		return min;
	}
	
	public void setSeg(int seg) {
		this.seg = seg;
	}
	public int getSeg() {
		return seg;
	}
	
	public void sumar(int hora, int min, int seg) {
		setHora(this.hora+hora);
		setMin(this.min+min);
		setSeg(this.seg+seg);
		comprobar();
	}
	
	public void comprobar() {

			if(seg>59) {
				setSeg((seg%60)*60);
				setMin((int)(seg/60));
			}
			
			if(min>59) {
				setMin((min%60)*60);
				setHora((int)(min/60));
			}
			
			if(hora>23) {
				double hora = this.hora/24; 
				setHora((int)(hora));
				double min = hora%24*60;
				setMin((int)(min));
				setSeg((int)(min%60*60));
			}
		}
		
}
