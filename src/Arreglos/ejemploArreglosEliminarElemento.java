package Arreglos;

import java.util.Scanner;

public class ejemploArreglosEliminarElemento {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int [10];
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("ingrese un número: ");
			a[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("Ingrese una posición a eliminar entre 0  - 9: ");
		int posicion = sc.nextInt();
		
		for(int i = posicion; i < a.length - 1; i++ ) {
			a[i] = a[i+1];
		}
//		for (int i = 0; i < a.length - 1; i++) {
//			System.out.println(i + " => " + a[i]);
//		}
		int [] b = new int[a.length-1];
		
		System.arraycopy(a, 0, b, 0, b.length);
		
		a = b;
		for(int i = 0; i < a.length;i++) {
			System.out.println(i + " => " + a[i]);
		}
	}

}
