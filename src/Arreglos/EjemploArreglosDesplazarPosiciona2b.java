package Arreglos;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosiciona2b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[10];
		int elemento, posicion, ultimo;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Inserte un núumero: ");
			a[i] = sc.nextInt();
			
		}
		System.out.println();
		
		System.out.println("Nuevo número");
		elemento = sc.nextInt();
		
		
		System.out.println("Ingrese un número a ingresar: ");
		posicion = sc.nextInt();
		
		ultimo = a[a.length -1];
		
		for(int i = a.length -2; i >= posicion; i--) {
			a[i+1] = a[i];
			
		}
		int [] b = new int[a.length+1];
		System.arraycopy(a, 0, b, 0, a.length);
		
		a = b; 
		
		a[posicion] = elemento;
		
		a[b.length-1] = ultimo;
		
		System.out.println("El número queda ordenador en: ");
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(i + ":" + a[i]);
		}
	
	}

}
