package PasarPorValor;



public class PasarXReferencia2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Personas persona = new Personas();
		persona.modificarNombre("David");
		System.out.println("persona" + persona.leerNombre());

		
		System.out.println("ANTES DE TEST");
		test(persona);
		
		System.out.println("despu�s de llamar al metodo test");
		
		System.out.println("persona " + persona.leerNombre());
		
		System.out.println("Finaliza el m�todo main con los datos de la persona modificada");


	}

	public static void test(Personas persona) {

		System.out.println("inicializamos el m�tdo test");
		persona.modificarNombre("Antonio");
		System.out.println("Finaliza el m�todo test");
	}

}

