package es.guardia;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import es.guardia.guardia.Guardia;
import es.guardia.guardia.GuardiaOrden;
import es.guardia.guardia.Imaginaria;
import es.guardia.guardia.Militar;

public class App {

	public static void main(String[] args) {
	
		Militar paco = new Militar ("PACO","UUU");
		Militar juan = new Militar ("JUAN","JJJUUU");
		
		List<Militar> militares = new ArrayList<>();
		militares.add(juan);
		militares.add(paco);
		
		//El método tiene muchas sobrecargar. usamos: año, mes, dia, hora, minutos
		LocalDateTime inicio = LocalDateTime.of(2022,12,20,14,00);
		LocalDateTime fin = LocalDateTime.of(2022,12,20,20,00);
		
		Guardia g = new Guardia(inicio,fin,"puertas",militares);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd - HH:mm");
		
		System.out.println(inicio.format(formatter) + "h");
		
		
		
		System.out.println(g);
		
		
		GuardiaOrden go = new GuardiaOrden(inicio, fin, null, juan);
		
		System.out.println(go);
		
		Imaginaria im = new Imaginaria();
		
		System.out.println(im);
		LocalTime asdf = LocalTime.of(23, 00);
		System.out.println(LocalDateTime.of(LocalDate.now(),LocalTime.of(23,00)));
		
		System.out.println(asdf);

	}

}
