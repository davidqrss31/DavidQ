package poo_excepciones;

import javax.swing.JOptionPane;

public class Excepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculadora cal = new calculadora();
		String valor = JOptionPane.showInputDialog("ingresamos un entero");
		int divisor;
		double division;
		try {
			divisor = Integer.parseInt(valor);
			division = cal.dividir(10,divisor);
			System.out.println(division);
			
			double division2 = cal.dividir("10", "5");
			System.out.println("divisor2 = " + division2);
		} catch (NumberFormatException nfe) {
			System.out.println("Se detecto una excepción: " + "ingrese por favor un número" + nfe.getMessage());
			main(args);
		}catch (FormatoNumeroException e){
			System.out.println("Se detecto una excepción: ingrese un número válido: " + e.getMessage());
			e.printStackTrace(System.out);
		} catch (divisionException e) {
			// TODO: handle exception
			System.out.println("capturamos la excepcion" + e.getMessage());
			main(args);
		
		} finally {
			System.out.println("es opcional, pero se ejecuta siempre");
		}
		System.out.println("continuamos con la ejecución");

	}

}
