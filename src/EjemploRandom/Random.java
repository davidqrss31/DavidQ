package EjemploRandom;

public class Random {

	public static void main(String[] args) {
	double random = Math.random();
	System.out.println("Número aleatorio: " + random);
	
	random *= 7;
	System.out.println("random por 7" + random);
	
	String [] colores = {"Azul", "Verde", "Rojo", "Naranja"};
	random *= colores.length;
	System.out.println("colores: " + colores[(int) random]);
	
	
	Random randomobj = new Random(); 
	int radomInt = randomobj.nextInt();
	

	}

}
