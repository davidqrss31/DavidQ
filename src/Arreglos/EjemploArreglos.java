package Arreglos;

import java.util.Arrays;

public class EjemploArreglos {

	public static void main(String[] args) {
		
		String [] productos = new String [7];
		
		productos[0] = "ordenador";
		productos[1] = "casa";
		productos[2] = "perros";
		productos[3] = "raton";
		productos[4] = "atun";
		productos[5] = "coche";
		productos[6] = "serpente";
		
		Arrays.sort(productos);
		
		System.out.println(productos[0]);
		System.out.println(productos[1]);
		System.out.println(productos[2]);
		System.out.println(productos[3]);
		System.out.println(productos[4]);
		System.out.println(productos[5]);
		System.out.println(productos[6]);
		
		
		
	
		

	}

}
