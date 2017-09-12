package gt.edu.url.examen1.impl;

import gt.edu.url.examen1.api.AlgoritmoChudnovsky;
import gt.edu.url.examen1.api.JuegosTennis;
import gt.edu.url.examen1.api.Monster;
import gt.edu.url.examen1.api.Stack;

/**
 * Prueba las clases anteriores
 * @author Gary Moran
 */
public class Main {
    
    public static void main(String[] args) {
    	System.out.println("-----------------Serie 1------------");
    	AlgoritmoChudnovsky alg=new AlgoritmoChudnovsky();
        System.out.println("Serie 1 Chudnovsky "+alg.calcularPi(1));
        System.out.println("-----------------Serie 2------------");
    	JuegosTennis play=new JuegosTennis();
    	System.out.println(play.calcularGanador(6, 3));
    	System.out.println(play.calcularGanador(7, 5));
    	System.out.println(play.calcularGanador(8, 3));
    	System.out.println(play.calcularGanador(2, 6));
    	System.out.println(play.calcularCampeon());
    	System.out.println(play.recordarGanador(2));
    	   System.out.println("-----------------Serie 3------------");
    	   Monster mon=new Monster();
    	   Monster mon2=new Monster();
    	   mon.setColor("rojo");
    	   mon.setEdad(20);
    	   mon.setElemento("Fuego");
    	   mon.setNombre("Jueani");
    	   mon2.setColor("rojo");
    	   mon2.setEdad(20);
    	   mon2.setElemento("Fuego");
    	   mon2.setNombre("Jueani");
    	   mon.apilar(mon);
    	   mon.apilar(mon.fabricar("Fuego"));
    	   mon.apilar(mon2);
    	   mon.encolar(mon);
    	   mon.encolar(mon.fabricar("Fuego"));
    	   mon.encolar(mon2);
    	   mon.desapilar(mon);
    	   
    

    }
    
}
