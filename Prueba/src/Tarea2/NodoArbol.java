package Tarea2;

import java.util.Random;

public class NodoArbol {
	private NodoArbol nodoPadre; 
	//private Estado estadoActual;
	private String accion; 
	private int valor;
	private int costo; 

public NodoArbol(Estado estado) {
	this.nodoPadre = null;
	this.estadoActual = estado;
	this.accion = null;
	this.valor = 0;
	this.costo = 0;
}
}