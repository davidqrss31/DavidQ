package Calculararecirculo;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        double area; // el �rea a calcular

        double radio; // radio a ingresar
        System.out.println("Introduce el radio de un circulo: ");
        radio = scanner.nextDouble();
        area = Math.PI * Math.pow(radio, 2);

        System.out.println("El �rea de una circunferencia de radio " + radio + " es: " + area);

	}

}
