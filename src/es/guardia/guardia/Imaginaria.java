package es.guardia.guardia;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Imaginaria extends Guardia{

	public Imaginaria(LocalDateTime horaFin, String denominacion, List<Militar> personal) {
		super(LocalDateTime.of(LocalDate.now(),LocalTime.of(23,00)), horaFin, denominacion, personal);
		// TODO Auto-generated constructor stub
	}
	public Imaginaria() {
		this(LocalDateTime.of(LocalDate.now(),LocalTime.of(23,00)).plusHours(8), null, new ArrayList<Militar>(4)); 
	}
	@Override
	public String toString() {
		return "Imaginaria []" + super.toString();
	}
	
	

}
