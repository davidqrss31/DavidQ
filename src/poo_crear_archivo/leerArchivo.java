package poo_crear_archivo;

public class leerArchivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombreArchivo = "H:\\javados.txt";
		servicio service = new servicio();
		System.out.println(servicio.leerArchivoScanner(nombreArchivo));
	

	}

}
