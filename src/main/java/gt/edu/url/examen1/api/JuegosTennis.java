package gt.edu.url.examen1.api;
/**
 * Determina ganadores de un juego de tennis e indica resultado de los juegos.
 * @author garya
 *
 */
public class JuegosTennis implements Reportero {
	Lista<String> lista1=new Lista<>();
	@Override
	/**
	 * Calcula al ganador dependiendo del resultado.
	 */
	public String calcularGanador(int a, int b) {
		String res="";
		if(a>7 || b>7 ) {
			res= "Marcador Invalido";
		}
		else {
			if(a>b) {
				if((a==6) && (b<5) || (a==7)&&(b<=6)  ) {
					lista1.insertarPrimero("Ganador A");
					res= "El Set termino, El equipo A es el ganador";
				}
			}
			else if((b==6 && a<5)  || (b==7)&&(a<=6)){
			
					lista1.insertarPrimero("Ganador B");
					res= "El Set termino, El equipo B es el ganador";
				
			}
			else {
				res= "El set aun no termina";
			}
			}
		
		
		return res;
	}
	/**
	 * Calcula al campeon despues de n sets
	 */

	@Override
	public String calcularCampeon() {
		int elementos=lista1.cuantosElementos();
		int contA=0;
		int contB=0;
		String res="";
		for(int x=0; x<elementos;x++) {
			if(lista1.devolverDato(x).equals("Ganador A")) {
				contA++;
			}
			else if(lista1.devolverDato(x).equals("Ganador B")) {
				contB++;
			}
		}
		if(contA>contB) {
			res="A es el campeon";
		}
		else {
			if(contB>contA) {
				res="B es el campeon";
			}
			else {
				res="No hay campeon";
			}
		}
		return res;
	}

	@Override
	/**
	 * Devuelve el campeon.
	 */
	public String recordarGanador(int juego) {
		return lista1.devolverDato(juego);
	}

}
