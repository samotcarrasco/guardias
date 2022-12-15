package es.guardia.guardia;

import java.time.LocalDateTime;
import java.util.List;

public class GuardiaOrden extends Guardia{

	public GuardiaOrden(LocalDateTime horaInicio, LocalDateTime horaFin, String denominacion, Militar mando) {
		super(LocalDateTime.now(), LocalDateTime.now().plusDays(1), denominacion, null);
		this.addPersonal(mando);
	}
	
	public void amonestar(Militar militar) {
		System.out.println(militar.getNombre() + "ha recibido.. "+ this.getDenominacion() + " alas " + LocalDateTime.now());
		
	}

}
