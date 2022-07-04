package Arreglos;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosiciona3b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[7];
		int numero, posicion, ultimo;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Inserte un núumero: ");
			a[i] = sc.nextInt();
			
		}
		System.out.println();
		
		System.out.println("Ingrese un número a ingresar: ");
		numero = sc.nextInt();
		
		ultimo = a[a.length -1];
		posicion = 0;
		
		while (posicion < 6 && numero > a[posicion]) {
			posicion++;
			
		}
		
		for(int i = a.length -2; i>= posicion; i--) {
			a[i+1] = a[i];
			
		}
		
		
		int [] b = new int [a.length + 1];
		System.arraycopy(a, 0, b, 0, a.length);
		
		if(numero > ultimo) {
			b[b.length - 1] = ultimo; 
		}else {
		
		b[b.length - 1] = ultimo;
		b[posicion] = numero;
		}
		
		System.out.println("El número queda ordenador en: ");
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(i + ":" + b[i]);
		}
	
	}

}
