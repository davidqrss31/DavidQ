package PasarPorValor;

class Persona{
	private String nombre;
	
	public void modificarNombre(String nuevoNombre) {
		this.nombre = nuevoNombre;
	}
}

public class PasarXReferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] edad = {10, 11, 12} ;
		
		
		System.out.println("iniciamos el metodo con main");
		for(int i  = 0; i < edad.length; i++) {
			System.out.println("edad[i] = " + edad[i]);
		}
		System.out.println("ANTES DE TEST");
		test(edad);
		
		System.out.println("después de llamar al metodo test");
		for(int i  = 0; i < edad.length; i++) {
			System.out.println("edad[i] = " + edad[i]);
		}

	}
	public static void test(int[] edad) {
		
		System.out.println("inicializamos el mètdo test");
		for(int i = 0; i < edad.length; i++) {
			edad[i] = edad[i] + 20;
		}
		System.out.println("Finaliza el método test");
	}
	
	
}
