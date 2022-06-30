package DetalleDeFactura;

import java.util.Scanner;

public class DetalleDeFactura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double iva = 19;

		System.out.println("Escribe un nombre para la factura");
		String nombreFactura = sc.nextLine();

		System.out.println("Escribe un precio para el producto 1");
		double precioProducto1 = sc.nextDouble();

		System.out.println("Escribe un precio para el producto 2");
		double precioProducto2 = sc.nextDouble();

		System.out.println("La factura " + nombreFactura + " sin iva: " + (precioProducto1 + precioProducto2) + " \n"
				+ "precio con iva: " + (precioProducto1 + precioProducto2 / 1 * iva));

	}

}
