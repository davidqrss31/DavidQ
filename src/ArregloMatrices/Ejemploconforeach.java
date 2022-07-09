package ArregloMatrices;

public class Ejemploconforeach {

	public static void main(String[] args) {
		
		String[][] nombres = {{"David","Antonio" },{"Emma", "Luisa"}};
		
		for(String[] fila: nombres) {
			for(String columnas : fila) {
				System.out.println("nombre= " + columnas);
			}
		}

	}

}
