package javaUltilDate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {

	public static void main(String[] args) {
		Date fecha = new Date();
		
		System.out.println(fecha);
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy h:m:ss ");
		String fechastr = df.format(fecha);
		
		long j = 0;
		
		for (int i = 0; i <10000000; i++) {
			j += i;
			
		}
		
		System.out.println("j: " + j);
		Date fecha2 = new Date();
		long tiempoFinal = fecha2.getTime() - fecha.getTime();
		System.out.println("tiempotranscurrido" + tiempoFinal);
		
		System.out.println(fechastr);
	}

}
