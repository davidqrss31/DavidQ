package Arreglos;

import java.util.Scanner;

public class EmploArreglosMayor {

	public static void main(String[] args) {
		
		
		int[] a = new int [5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese 5 n�meros enteros: ");
		int mayor = a.length;
		for(int i = 0; i < mayor; i++) {
			
			a[i] = sc.nextInt();
		}
		
		int max = 0;
		
		for (int i = 1; i < mayor; i++) {
			max = (a[max] > a[i])? max: i;
		}
		
		System.out.println("El n�mero mayor es: " + a[max]);
	}

}
