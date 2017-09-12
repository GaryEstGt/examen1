package gt.edu.url.examen1.api;

/**
 * Calcula el algoritmo de Chundnovsky
 * @author garya
 *
 */
public class AlgoritmoChudnovsky implements Chudnovsky {
	/**
	 * calcula el factorial de un numero siendo un método recursivo
	 * @param numero
	 * @return factorial
	 */
	public int hacerFactorial(int numero) {
		if(numero==0) {
			return 1;
		}
		else {
			return numero*hacerFactorial(numero-1);
		}
	}
	/**
	 * utiliza el algoritmo de chudnovsky para calcular n digitos de pi
	 */
	@Override
	public double calcularPi(int cantidadDigitos) {
		// TODO Auto-generated method stub
		if(cantidadDigitos<0) {
			return 0;
		}
		else {
			double ultimaelevacion=((3*cantidadDigitos)+1.5);
			double numerador=Math.pow(-1, cantidadDigitos)*this.hacerFactorial(6*cantidadDigitos)*(545140134*(cantidadDigitos)+13591409);
			double denominador=(this.hacerFactorial(3*(cantidadDigitos))*(Math.pow(this.hacerFactorial(cantidadDigitos), 3))*(Math.pow(640320,ultimaelevacion)))+this.calcularPi(cantidadDigitos-1);
			double Valor1= (numerador/denominador)+calcularPi(cantidadDigitos-1);
			return 12*Valor1;
		}
	}
}
