package unidades.unidad7.ejemplos.fechas;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class FechasHoras {

	public static void main(String[] args) {
	
		//Hasta Java 8.0- No se suelen usar en proyectos nuevos
		Date fecha = new Date();
		Calendar calendario = Calendar.getInstance();
		
		//Fecha de hoy.
		LocalDate fechaHoy = LocalDate.now();
		
		System.out.println("Fecha hoy:"+fechaHoy);
		
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/M/yy");
		
		System.out.println("Fecha hoy:"+fechaHoy.format(formatoFecha));
		
		//Fecha usuario
		LocalDate fechaUsuario = LocalDate.of(2025,Month.JANUARY, 8);
		System.out.println("Fecha usuario:"+fechaUsuario);
		System.out.println("Fecha usuario:"+fechaUsuario.format(formatoFecha));
		
		
		//Horas
		LocalTime horaActual = LocalTime.now();
		System.out.println("Hora actual:"+horaActual);
		DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
		System.out.println("Hora actual:"+horaActual.format(formatoHora));
		LocalTime horaUsuario = LocalTime.of(10, 45);
		System.out.println("Hora usuario:"+horaUsuario.format(formatoHora));
		
		
		//Fechas y horas
		LocalDateTime fechaHora = LocalDateTime.now();
		System.out.println("Fecha y hora:"+fechaHora);
		DateTimeFormatter formatoFechaHora = 
				DateTimeFormatter.ofPattern("dd/MM/yy - HH:mm");
		
		System.out.println("Fecha y hora:"+fechaHora.format(formatoFechaHora));
		LocalDateTime fechaHoraUsuario = LocalDateTime.of(fechaUsuario, horaUsuario);
		System.out.println("Fecha y hora usuario:"+fechaHoraUsuario.format(formatoFechaHora));
		
		System.out.println("----------OPERACIONES CON FECHA-----------");
		
		//Sumar dias a una fecha.
		LocalDate fechaNueva = fechaHoy.plusDays(7);
		System.out.println("Fecha nueva:"+fechaNueva.format(formatoFecha));
		LocalDate fechaAntes = fechaHoy.minusMonths(2);
		System.out.println("Fecha nueva:"+fechaAntes.format(formatoFecha));
		
		
		if(fechaHoy.isBefore(fechaAntes)) {
			System.out.println("La fecha es anterior");
		}else {
			System.out.println("La fecha es posterior");
		}
		
		if(fechaHoy.isAfter(fechaAntes)) {
			System.out.println("La fecha es posterior");
		}else {
			System.out.println("La fecha es anterior");
		}
		
		
		//Calcular difefencias entre fechas
		long diferenciasDias =  ChronoUnit.DAYS.between(fechaAntes,fechaNueva);
		System.out.println("Días entre las fechas:"+diferenciasDias);
		
		//Calcular difefencias entre HORAS
		long diferenciaHoras =  ChronoUnit.MINUTES.between(horaActual,horaUsuario);
		System.out.println("Minutos entre las horas:"+diferenciaHoras);
		
		
		Duration duracion = Duration.between(horaActual, horaUsuario);
		System.out.println("Duración entre tiempos:"+duracion);
		System.out.println("Horas entre tiempos:"+duracion.toHours());
		System.out.println("Minitus entre tiempos:"+duracion.toMinutes());
		
		//COnvertir duracion a varias undiades
		Duration duracionUsuario = Duration.ofMinutes(125);
		
		System.out.println("Horas:"+duracionUsuario.toHours());
		System.out.println("Segundos:"+duracionUsuario.toSeconds());
		System.out.println("Milisegundos:"+duracionUsuario.toMillis());
		System.out.println("Nanosegundos:"+duracionUsuario.toNanos());
		
		Instant inicio = Instant.now();
		
		//Operacion que queremos medir su rendimiento
		for(int i=0;i<10_000_000;i++) {
			Math.sqrt(i);
		}
		
		
		Instant fin = Instant.now();
		Duration duracionOperaicon = Duration.between(inicio, fin);
		
		System.out.println("Tiempo de ejecución:"+duracionOperaicon.toMillisPart());
		
		
	}

}















