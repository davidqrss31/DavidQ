package Arreglos;

import java.util.Arrays;

public class EjemploArreglosFor {

	public static void main(String[] args) {

		String[] productos = { "ordenador", "casa", "perros", "raton", "atun", "coche", "serpente" };

		int total = productos.length;

		Arrays.sort(productos);//ordena
		for (int i = 0; i < total - 1; i++) {
			System.out.println("para indice: " + i + ":" + productos[i]);
		}
		System.out.println("--- foreach ---");
		for (String prod : productos) {
			System.out.println("prod = " + prod);
		}

		System.out.println("--- while ---");
		int i = 0;

		while (i < total) {
			System.out.println("para indice: " + i + ":" + productos[i]);

			i++;
		}

		System.out.println("--- do while ---");
		int j = 0;

		do {
			System.out.println("para indice: " + j + ":" + productos[j]);

			j++;
		} while (j < total);

		int[] numeros = { 1, 2, 10, 23, 443, 5, 6, 78, 999 };

		int totalNumeros = numeros.length;
		
		for (int h = 0; h < totalNumeros; h++) {
			numeros[h] = h*5;
		}
		
		for (int h = 0; h < totalNumeros; h++) {
			System.out.println("Numeros = " + numeros[h]);
		}
		
		

	}

}
