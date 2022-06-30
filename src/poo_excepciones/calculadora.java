package poo_excepciones;

public class calculadora {
	public double dividir(int numerador, int divisor) throws divisionException {
		if (divisor == 0) {
			throw new divisionException("no se puede dividir por 0");
		}
		return numerador/(double)divisor;
	}
	public double dividir(String numerador, String divisor) throws divisionException, FormatoNumeroException {
		try {
			int num = Integer.parseInt(numerador);
			int div = Integer.parseInt(divisor);
			return this.dividir(num, div);
		} catch (NumberFormatException e) {
			throw new FormatoNumeroException("Debe ingresar un número en el numerador y el divisor");
			// TODO: handle exception
		}
	}

}
