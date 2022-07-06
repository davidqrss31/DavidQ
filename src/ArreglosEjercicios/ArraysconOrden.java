package ArreglosEjercicios;

import java.util.Scanner;

public class ArraysconOrden {
/*
 * Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos. Luego debemos mostrarlos en el siguiente orden: 
 * el último, el primero, el penúltimo, el segundo, el antepenúltimo, el tercero, y así sucesivamente.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int [] arrayDiez = new int [10];
		int ultimo;
		
		
		for(int i = 0; i < arrayDiez.length; i++) {
			System.out.println("Escribe 9 números: ");
			arrayDiez [i] = sc.nextInt();
		}
		System.out.println( "-  - - - - - -");
		ultimo = arrayDiez[arrayDiez.length -1];
		for(int i = arrayDiez.length - 2; i >= 0; i--) {
			arrayDiez[i + 1] = arrayDiez[i];
		}
		arrayDiez [0] = ultimo;
		for (int i = 0; i < arrayDiez.length; i++) {
			System.out.println(arrayDiez[i]);
		}

	}

}
