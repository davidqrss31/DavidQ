package Arreglos;

import java.util.Arrays;

public class EjemploArreglosForInverso {

	public static void main(String[] args) {

		String[] productos = { "ordenador", "casa", "perros", "raton", "atun", "coche", "serpente" };

		int total = productos.length;
//
//		Arrays.sort(productos);// ordena
		
		System.out.println("--- usando for inverso ---");
		for (int i = 0; i < total; i++) {
			System.out.println("para indice: " + (total - 1 - i) + ":" + productos[total - 1 - i]);
		}
		
		System.out.println("--- decrementando ---");
		for (int i = total - 1; i >= 0; i--) {
			System.out.println("para indice: " + i + ":" + productos[i]);
		}

	}

}
