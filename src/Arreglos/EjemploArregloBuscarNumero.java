package Arreglos;

import java.util.Scanner;

public class EjemploArregloBuscarNumero {

	public static void main(String[] args) {
		
		int[] a = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("Ingrese un número: ");
			a[i] = sc.nextInt();
		}
		
		System.out.println("\r\nIngrese un número a buscar: ");
		int numaBuscar = sc.nextInt();
		int i = 0;
		while(i < a.length && a[i] != numaBuscar) {
			i++;
		}
		if (i == a.length) {
			System.out.println("Número no encotrado");
		}else if (a[i] == numaBuscar) {
			System.out.println("Número encotrado en la posición " + "= " + i);
		}

	}

}
