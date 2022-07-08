package ArreglosEjercicios;

import java.util.Scanner;

/*
 * Leer 7 números por teclado para llenar un arreglo y a continuación calcular 
 * el promedio de los números positivos, el promedio de los negativos y contar el número de ceros.
 */
public class EjSistemaEstadisticosArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[7];
		int contadorPositivos = 0;
		int contadorCeros = 0;
		int contadorNegativos = 0;
			
		for(int num : numeros ) {
			
			System.out.println("Ingrese un número y presione enter: ");
			num = sc.nextInt();
		
			if (num == 0) {
				contadorCeros++;
			}else if(num > 0) {
				contadorPositivos += num;
				contadorPositivos++;
			}else if(num < 0) {
				contadorNegativos += num;
				contadorNegativos++;
			}
		}
		System.out.println("En el Array hay: " + contadorPositivos / numeros.length + " Promedio positivos");
		System.out.println("En el Array hay: " + contadorNegativos / numeros.length + " Promedio negativos");
		System.out.println("En el Array hay: " +  contadorCeros + " ceros");
	
	}

}
