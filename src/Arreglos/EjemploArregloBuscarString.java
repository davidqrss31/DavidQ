package Arreglos;

import java.util.Scanner;

public class EjemploArregloBuscarString {

	public static void main(String[] args) {
		
		String[] a = new String[4];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("Ingrese un nombre: ");
			a[i] = sc.next();
		}
		
		System.out.println("\r\nIngrese un nombre a buscar: ");
		String nombreBuscar = sc.next();
		int i = 0;
		while(i < a.length && !a[i].equalsIgnoreCase(nombreBuscar)) {
			i++;
		}
		if (i == a.length) {
			System.out.println("Nombre no encotrado");
		}else if (a[i].toLowerCase().compareTo(nombreBuscar.toLowerCase()) == 0) {
			System.out.println("Nombre encotrado en la posición " + "= " + i);
		}

	}

}
