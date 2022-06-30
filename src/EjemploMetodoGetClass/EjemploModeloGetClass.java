package EjemploMetodoGetClass;

import java.lang.reflect.Method;

public class EjemploModeloGetClass {

	public static void main(String[] args) {
		String txt = "hola";
		Class strClass = txt.getClass();
		
		System.out.println("strClass.getName() = " + strClass.getName());
		System.out.println("strClass.getName() = " + strClass.getSimpleName());
		System.out.println("strClass.getName() = " + strClass.getPackageName());
		System.out.println("strClass.getName() = " + strClass.getClass());
		
		for(Method  metodo: strClass.getMethods()) {
			System.out.println("metodo.getName() = " + metodo.getName());
		}

	}

}
