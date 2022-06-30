package poo_crear_archivo;

import poo_crear_archivo_servicio.servicio;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombreArchivo = "H:\\javados.txt";
		
		servicio service = new servicio();
		service.leerArchivo(nombreArchivo);
	}

}
