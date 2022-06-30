package MenordDicezN;

import java.util.Scanner;

public class MenordeDiez {

	/*
	 * Crear una clase con el método main donde el desafío es buscar el número menor
	 * de mínimo 10 valores enteros, usando la clase Scanner ingresar la cantidad de
	 * números a comparar, luego utilizando una sentencia for iterar el numero de
	 * veces (ingresado) para pedir el numero entero, entonces se requiere: -
	 * Calcular el menor número e imprimir el valor. - Si el menor número es menor
	 * que 10, imprimir "El número menor es menor que 10!". si no, imprimir " el
	 * numero menor es igual o mayor que 10!".
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe un n�mero: ");
		int num = sc.nextInt();

		for (int i = 0; i <= 10; i++) {

			if (num < 10) {
				System.out.println("El n�mero menor es menor que 10!");
				break;
			} else if (num >= 10) {

				System.out.println("numero menor es igual o mayor que 10!");
				break;
			}
		}

	}

}
