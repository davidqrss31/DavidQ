package Arreglos;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosiciona3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[10];
		int elemento, posicion;
		Scanner sc = new Scanner(System.in);
		
		
		for (int i = 0; i < a.length-1; i++) {
			System.out.print("Ingrese el número: ");
			a[i] = sc.nextInt(); 
		}
		System.out.println();
		
		System.out.println("Nuevo elemento:");
		elemento = sc.nextInt();
		
		System.out.println("Posicion donde agregar del 0 al 9");
		posicion = sc.nextInt();
		
		for (int i = a.length -2; i >= posicion; i--) {
			a[i+1] = a[i];
		}
		a[posicion] = elemento;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
