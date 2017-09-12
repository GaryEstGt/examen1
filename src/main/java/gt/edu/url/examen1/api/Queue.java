package gt.edu.url.examen1.api;
import java.util.ArrayList;

public class Queue extends Lista {
	//se añade un elemento a la cola. Se añade al final de esta.
	 public void encolar(Object dato){
	  if(dato != null){
	   this.insertarPrimero(dato);
	  }else{
	   System.out.println("Introduzca un dato no nulo");
	  }  
	 }

	 //se elimina el elemento frontal de la cola, es decir, el primer elemento que entró.
	 public void desencolar(){
	  if(this.cuantosElementos() > 0){
	   this.borraPosicion(0);
	  }
	 }
	 
	 //se devuelve el elemento frontal de la cola, es decir, el primer elemento que entró.
	 public Object frente(){
	  Object datoAuxiliar = null;
	  if(this.cuantosElementos() > 0){
	   datoAuxiliar = this.devolverDato(0);
	  }
	  return datoAuxiliar;  
	 }
	 
	 //devuelve cierto si la pila está vacía o falso en caso contrario (empty).
	 public boolean vacia(){
	  return this.estaVacia();
	 }
}
