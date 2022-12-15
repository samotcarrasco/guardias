package es.guardia.guardia;

public class Militar {
	String TIM;
	String Nombre;
	public Militar(String tIM, String nombre) {
		super();
		TIM = tIM;
		Nombre = nombre;
	}
	
	
	
	protected String getTIM() {
		return TIM;
	}



	protected void setTIM(String tIM) {
		TIM = tIM;
	}



	protected String getNombre() {
		return Nombre;
	}



	protected void setNombre(String nombre) {
		Nombre = nombre;
	}



	@Override
	public String toString() {
		return "Militar [TIM=" + TIM + ", Nombre=" + Nombre + "]";
	}

}
