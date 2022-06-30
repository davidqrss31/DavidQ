package EjemploClaseMarh;

public class EjemploClaseMarh {

	public static void main(String[] args) {
		
		int absoluto = Math.abs(-3);
		System.out.println("absoluto = " + absoluto);
		
		double max = Math.max(3.5, 1.2 );//coge el pequeño
		System.out.println("el más grande = " + max);
		
		double min = Math.min(3.5, 1.2 );// coge el pequeño
		System.out.println("de los dos números el más pequeño = " + min);
		
		double redondeaArriba = Math.ceil(3.5);//redondea hacia arriba
		System.out.println("redondeo hacia arriba = " + redondeaArriba);
		
		double redondeaBajo = Math.floor(3.5);
		System.out.println("redondeo hacia Abajo = " + redondeaBajo);
		
		long redondear = Math.round(Math.PI);
		System.out.println("Redondea = " + redondear);
		
		double exp = Math.exp(5);//elevado a ()
		System.out.println("exp " + exp);
		
		double log = Math.log(10);//logaritmo natural
		System.out.println("logaritomo natural: " + log);
		
		double pontencia = Math.pow(10, 3);
		System.out.println("pontencia" + pontencia);
		
		double raizcuadrada = Math.sqrt(5);
		System.out.println("raiz cuadrada de 5 es: " + raizcuadrada);
		
		double grados = Math.toDegrees(1.57);
		
		grados= Math.round(grados);
		System.out.println("Convertir de radiales a grados " + grados);
		
		double radiales = Math.toRadians(90.00);
//		radiales = Math.round(radiales);
		System.out.println("convertir de grados a radiales" + radiales);
		
		System.out.println("sin(90) " + Math.sin(radiales));
		System.out.println("sin(90) " + Math.cos(radiales));
		
		radiales = Math.toRadians(180.00);
		System.out.println("sin(180) " + Math.cos(radiales));
		
		radiales = Math.toRadians(0.00);
		System.out.println("sin(0) " + Math.cos(radiales));
		
		
		
		

	}

}
