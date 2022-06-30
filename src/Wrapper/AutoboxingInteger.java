package Wrapper;

public class AutoboxingInteger {

	public static void main(String[] args) {

		Integer[] enteros = { Integer.valueOf(1), 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
		int suma = 0;

		
		System.out.println("-- forma implicita --");
		for (Integer i : enteros) {

			if (i.intValue() % 2 == 0) {
				suma += i.intValue();// retorna el valor primitivo del Integer
			}
		}
		System.out.println("Suma= " + suma);
		
		System.out.println("-- forma automatica, se hace un autoboxing al primitivo --");
		
		suma = 0;
		for (Integer i : enteros) {

			if (i % 2 == 0) {
				suma += i.intValue();// retorna el valor primitivo del Integer
			}
		}
		System.out.println("Suma= " + suma);
	}

}
