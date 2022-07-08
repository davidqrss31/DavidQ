package ArreglosEjercicios;

/*
 * Escriba un programa que imprima el número más alto de un arreglo de 7 elementos (de rango 11 a 99), 
 * por ejemplo {14, 33, 15, 36, 78, 21, 43}, si se repite un valor considerar uno solo.
 */

public class ArraymasAlto {

	public static void main(String[] args) {

		int[] array = { 12, 18, 25, 37, 72, 80, 99 };
		int max = 0;

		for (int i = 0; i < array.length; i++) {
			max = (array[max] > array[i]) ? max : i;

		}

		System.out.println("El número mayor es: " + array[max]);

	}

}
