package Arreglos;


public class ArreglosOrdenPrincipioFinal {

	public static void main(String[] args) {
		int[] numeros = new int [10];
		int [] a = new int[10];
		
		int total = numeros.length;
		
		for (int i = 0; i <  total; i++) {
			numeros[i] = i + 1;
		}
		int aux = 0;
		for (int i = 0; i < numeros.length - 1; i++) {
			a[aux++] = numeros [i];
			a[aux++] = numeros[numeros.length - 1 - i];
			
			//System.out.print(numeros[i]+ " ");
			//System.out.println(numeros[numeros.length - 1 - i]);
			
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("a " + a[i]);
		}

	}

}
