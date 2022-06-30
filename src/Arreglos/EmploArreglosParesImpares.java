package Arreglos;

import java.util.Scanner;

public class EmploArreglosParesImpares {

	public static void main(String[] args) {
		
		
		int[] a, pares, impares;
		int totalpares = 0, totalIpares = 0;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Ingrese 10 números: ");
		a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2 == 0) {
				totalpares++;
				
			}else {
				totalIpares++;
			}
		}
		pares  = new int[totalpares];
		impares = new int [totalIpares];
		
		
		int j = 0;//para peres
		int k = 0;//para impares
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				pares[j++] = a[i];
			}else {
				impares[k++] = a[i];
			}
		}
		
		System.out.println("Pares");
		for (int i = 0; i < pares.length; i++) {
			System.out.print(pares[i]);
			
		}
		
		System.out.println("\r \nImpares");
		for (int i = 0; i < impares.length; i++) {
			System.out.print(impares[i]);
			
		}
		System.out.println();
		
	}

}
