package poo_crear_archivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class servicio {

	public void crearArchivo(String nombre) {
		File archivo = new File(nombre);
		try (FileWriter escritor = new FileWriter(archivo, true)){
			
			BufferedWriter buffer = new BufferedWriter(escritor);
			buffer.append("hola que tal" + "\n").append("xxxxxxx" + "\n")
			.append("escribiendo" + "\n");
			buffer.close();
//			escritor.append("hola que tal" + "\n").append("xxxxxxx" + "\n")
//			.append("escribiendo" + "\n");
//			escritor.close();
		System.out.println("Se ha escrito");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void crearArchivodos(String nombre) {
		File archivo = new File(nombre);
		try {
			FileWriter escritor = new FileWriter(archivo, true);
			PrintWriter buffer = new PrintWriter(escritor);
			buffer.print("hola que tal" + "\n");
			buffer.print("xxxxxxx" + "\n");
			buffer.print("escribiendo" + "\n");
			buffer.close();
//			escritor.append("hola que tal" + "\n").append("xxxxxxx" + "\n")
//			.append("escribiendo" + "\n");
//			escritor.close();
		System.out.println("Se ha escrito");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static String leerArchivo(String nombre) {
		StringBuilder sb = new StringBuilder();
		File archivo = new File(nombre);
		try (BufferedReader reader = new BufferedReader(new FileReader(archivo))){
			
			String linea;
			while ((linea = reader.readLine())!= null) {
				sb.append(linea).append("\n");
				System.out.println("Archivo Leido");
			}
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb.toString();
	}
	public static String leerArchivoScanner(String nombre) {
		StringBuilder sb = new StringBuilder();
		File archivo = new File(nombre);
		try {
			Scanner s = new Scanner (archivo);
			s.useDelimiter("\n");
			while (s.hasNext()) {
				sb.append(s.next()).append("\n");
			}
			s.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb.toString();
	}
	
}
