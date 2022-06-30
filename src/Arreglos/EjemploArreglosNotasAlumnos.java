package Arreglos;

import java.util.Scanner;

public class EjemploArreglosNotasAlumnos {

	public static void main(String[] args) {
		
		double[] claseMatematicas, claselenguaje, claseHistoria;
		double sumaNotasMate = 0, sumNotasLengua = 0, sumNotasHistoria = 0; 
		claseMatematicas = new double [7];
		claselenguaje  = new double [7];
		claseHistoria = new double [7];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese 7 notas para matematicas");
		for(int i = 0; i < claseMatematicas.length; i++) {
			claseMatematicas[i] = sc.nextDouble();
		}
		
		System.out.println("Ingrese 7 notas para lenguaje");
		for(int i = 0; i < claselenguaje.length; i++) {
			claselenguaje[i] = sc.nextDouble();
		}
		
		System.out.println("Ingrese 7 notas para historia");
		for(int i = 0; i < claseHistoria.length; i++) {
			claseHistoria[i] = sc.nextDouble();
		}
		
		for(int i = 0; i < 7; i++) {
			sumaNotasMate += claseMatematicas[i];
			sumNotasLengua += claselenguaje[i];
			sumNotasHistoria += claseHistoria[i];
		}
		double promedioclaseMatemaaticas = sumaNotasMate/claseMatematicas.length;
		double promedioclaseLenguaje = sumNotasLengua/claselenguaje.length;
		double promediocleseHistoria = sumNotasHistoria/claseHistoria.length;
		
		System.out.println("Pormedio clase Matemáticas: " + promedioclaseMatemaaticas);
		System.out.println("Promedio clase Lenguaje: " + promedioclaseLenguaje);
		System.out.println("Pormedio clase Historia: " + promediocleseHistoria);
		
		System.out.println("Pormedio total: " + (promedioclaseMatemaaticas + promedioclaseLenguaje + promediocleseHistoria)/3);
		
		System.out.println("ingrese identificador del alumno de (0 a 6): ");
		int id = sc.nextInt();
		
		double promedioAlumno = (claseMatematicas[id] + claselenguaje[id] + claseHistoria[id]/3);
		
		System.out.println("Promedio alumno = "+ id + ": " + promedioAlumno);
		
//		System.out.println("Pormedio clase Matemáticas: " + sumaNotasMate/claseMatematicas.length);
//		System.out.println("Promedio clase Lenguaje: " + (sumNotasLengua/claselenguaje.length));
//		System.out.println("Pormedio clase Historia: " + (sumNotasHistoria/claseHistoria.length));
	}

}
