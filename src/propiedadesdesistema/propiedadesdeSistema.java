package propiedadesdesistema;

import java.util.Properties;

public class propiedadesdeSistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String username = System.getProperty("user.name");
		System.out.println("usuario del ordenador " + username);
		
		String home = System.getProperty("user.home");
		System.out.println("Ruta del usuario " + home);
		
		String wordSpace = System.getProperty("user.dir");
		System.out.println("wordSpace " + wordSpace);
		
		String java = System.getProperty("java.version");
		System.out.println("Ruta del usuario " + java);
		
		String lineasSeparador = System.getProperty("line.separator");
		System.out.println("Primera linea " + lineasSeparador + "otro linea");
		
		Properties p = System.getProperties();
		p.list(System.out);
	}

}
