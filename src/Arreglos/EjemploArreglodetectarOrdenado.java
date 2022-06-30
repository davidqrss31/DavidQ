package Arreglos;

import java.util.Scanner;

public class EjemploArreglodetectarOrdenado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[7];
		
		System.out.println("ingrese 7 números: ");
		
		int numeros = a.length;
		for(int i = 0; i < numeros; i++) {
			a[i] = sc.nextInt();
		}
		boolean asccedemte = false;
		boolean descendente = false;
		for (int i = 0; i < numeros -1; i++) {
			if(a[i] > a[i+1]) {
				descendente = true;
				
			}
			else if (a[i] < a [i+1]) {
				asccedemte = true;
			}
		}
		
		if(asccedemte == true && descendente == true) {
			System.err.println("Array = desordenado");
		}
		
		if(asccedemte == false && descendente == false) {
			System.err.println("Array = son todos iguales");
		}
		
		if(asccedemte == true && descendente == false) {
			System.err.println("Array = ordenado de forma ascendente");
		}
		
		if(asccedemte == false && descendente == true) {
			System.err.println("Array = ordenado de forma descendente");
		}
	}

}
