package gt.edu.url.examen1.api;

import gt.edu.url.examen1.impl.Monstruo;
/**
 * Crea Monstruos y los introduce en pilas y colas
 * @author garya
 *
 */
public class Monster implements FabricaRanger {
	private String nombre;
	private String elemento;
	private int edad;
	private String color;
	Stack pila=new Stack();
	Queue cola=new Queue();
	//Inicio Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getElemento() {
		return elemento;
	}
	public void setElemento(String elemento) {
		this.elemento = elemento;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String poderAgigantarse() {
		return "Me estoy agigantando"; 
	}
	public String caminarLento() {
		return "camino lentisimo"; 
	}
	public String Golpear() {
		return "golpeo fuerte"; 
	}
	@Override
	public void hacerAlgo() {
		System.out.println("Soy un Mounstruo y hago algo");
	}
	/**
	 * Apila de una pila a un mounstruo
	 */
	@Override
	public boolean apilar(Monster monstruo) {
		pila.apilar(monstruo);
		return true;
	}
	/**
	 * desapila a un mounstruo
	 */
	@Override
	public boolean desapilar(Monster monstruo) {
		pila.desapilar();
		System.out.println("objeto desapilado");
		return false;
	}
	/**
	 * Ingresa en la cola a un monstruo.
	 */
	@Override
	public boolean encolar(Monster monstruo) {
		cola.encolar(monstruo);
		return true;
	}
	/**
	 * Desencola a un mounstruo.
	 */
	@Override
	public boolean desencolar(Monster monstruo) {
		cola.desencolar();
		System.out.println("objeto desencolado");
		return false;
	}
	/*
	 * (non-Javadoc)Fabrica un Monstruo
	 * @see gt.edu.url.examen1.api.FabricaRanger#fabricar(java.lang.String)
	 */
	@Override
	public Monster fabricar(String elemento) {
		Monster mon=new Monster();
		System.out.println("Monstruo de "+elemento+" Fabricado");
		
		return mon;
	}
	/**
	 * Determina el poder del monstruo dependiendo de si es de fuego o de viento
	 * @return
	 */
	public String poderEspecial() {
		String res="";
		if(elemento.equals("fuego")) {
			res="Mi poder especial es quemar";
		}
		else if(elemento.equals("viento")){
			res="Mi poder especial es volar";
			
		}
		else {
			res="No hay poder especial";
		}
		return res;
}
}
