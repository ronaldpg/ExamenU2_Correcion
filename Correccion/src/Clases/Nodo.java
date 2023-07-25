package Clases;

public class Nodo {
	protected Object dato;
	protected Nodo izdo;
	protected Nodo dcho;
	
	public Nodo(Object valor, Nodo ramaIzdo, Nodo ramaDcho) {
		dato = valor;
		izdo = ramaIzdo;
		dcho = ramaDcho;
	}

	public Object valorNodo() {
		return dato;
	}
	public void nuevoValor(Object dato) {
		this.dato = dato;
	}
	public Nodo subarbolIzdo() {
		return izdo;
	}
	public void ramaIzdo(Nodo izdo) {
		this.izdo = izdo;
	}
	public Nodo subarbolDcho() {
		return dcho;
	}
	public void ramaDcho(Nodo dcho) {
		this.dcho = dcho;
	}
	
	public void visitar() {
		System.out.println(dato + "");
	}
	
}
