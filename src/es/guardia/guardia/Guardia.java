package es.guardia.guardia;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;


public class Guardia {

	private LocalDateTime horaInicio;
	private LocalDateTime horaFin;
	private String denominacion;
	private List<Militar> personal;

	public LocalDateTime getHoraInicio() {
		return horaInicio;
	}

	public LocalDateTime getHoraFin() {
		return horaFin;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public void setHoraInicio(LocalDateTime horaInicio) {
		this.horaInicio = horaInicio;
	}

	public void setHoraFin(LocalDateTime horaFin) {
		this.horaFin = horaFin;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public List<Militar> getPersonal() {
		return personal;
	}

	public void setPersonal(List<Militar> personal) {
		this.personal = personal;
	}
	
	

	public Guardia(LocalDateTime horaInicio, LocalDateTime horaFin, String denominacion, List<Militar> personal) {
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.denominacion = denominacion;
		this.personal = personal;
	}

	public void addPersonal(Militar... militar) {
		// Arrays.stream(militar).forEach(m -> anadirPersonal(m));
		for (Militar m : militar) {
			if (getPersonal() == null) {
				this.personal = new ArrayList<Militar>();
				this.personal.add(m);
			} else {
				getPersonal().add(m);
			}
		}
	}

	protected void anadirPersonal(Militar militar) {
		if (getPersonal() == null) {
			this.personal = new ArrayList<Militar>();
			this.personal.add(militar);
		} else {
			getPersonal().add(militar);
		}
	}

	@Override
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd - HH:mm");
		
		
		return "Guardia [horaInicio=" + horaInicio.format(formatter) + "h, horaFin=" + horaFin.format(formatter) + "h, denominacion=" + denominacion
				+ ", personal=" + personal + "]";
	}

}
