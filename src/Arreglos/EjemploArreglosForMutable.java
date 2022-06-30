package Arreglos;

import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForMutable {

	public static void arreglosInverso(String[] arreglo) {
		int total2 = arreglo.length;
		int total = arreglo.length;
		for (int i = 0; i < total2; i++) {
			String actual = arreglo[i];
			String inverso = arreglo[total - 1 - i];
			arreglo[i] = inverso;
			arreglo[total - 1 - i] = actual;
			total2--;

		}
	}

	public static void main(String[] args) {

		String[] productos = { "ordenador", "casa", "perros", "raton", "atun", "coche", "serpente" };

		int total = productos.length;

		Arrays.sort(productos);// ordena
		
		arreglosInverso(productos);

//		for (int i = 0; i < total; i++) {
//			System.out.println("para indice: " + i + ":" + productos[i]);
//		}
//
//		
//		
//		System.out.println("-- otra forma --");
//		for(int i = 0; i < total/2; i++ ) {
//			String actual = productos[i];
//			String inverso = productos[total -1 -i];
//			productos[i] = inverso;
//			productos[total - 1- i] = actual;
//			
//		}
		
//		Collections.reverse(Arrays.asList(productos));// ordena como arreglosInverso

		for (int i = 0; i < total; i++) {
			System.out.println("para indice: " + i + ":" + productos[i]);
		}
	
		
	}

}
