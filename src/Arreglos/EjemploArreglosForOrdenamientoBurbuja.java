package Arreglos;

import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForOrdenamientoBurbuja {

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
		int contador = 0;
		
		for(int i = 0; i < total -1; i++) {
			for(int j = 0; j < total-1 - i; j++) {
				if(productos[j+1].compareTo(productos[j]) < 0) {
					String auxiliar = productos[j];
					productos[j] = productos[j+1];
					productos[j+1] = auxiliar;
				}
				contador++;
			}
		}
		
		


//		Arrays.sort(productos);// ordena

//		arreglosInverso(productos);

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
			System.out.println("para indice: " + i + ":" + productos[i] + contador);
		}

	}

}
