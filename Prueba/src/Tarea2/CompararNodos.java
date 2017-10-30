package Tarea2;

import java.util.Comparator;

public class CompararNodos implements Comparator<NodoArbol> {
	public int compare(NodoArbol n1, NodoArbol n2) {
		return n1.getValor() - n2.getValor();
	}

}
