package Clases;
 import javax.swing.JOptionPane;

public class Arbol {

	public Nodo raiz;

	public Arbol(Nodo raiz) {
		this.raiz = raiz;
	}

	public Arbol() {
		this.raiz = null;
	}
	
	public Arbol(Nodo raiz,Nodo izdo, Nodo dcho) {
		this.raiz = raiz;
		this.raiz.ramaIzdo(izdo);
		this.raiz.ramaDcho(dcho);
	}
	
	public void recorridoPostOrden(Nodo nodo) {
        if (nodo != null) {
            recorridoPostOrden(nodo.subarbolIzdo());
            recorridoPostOrden(nodo.subarbolDcho());
            nodo.visitar();
        }
    }

    public void recorridoInOrden(Nodo nodo) {
        if (nodo != null) {
            recorridoInOrden(nodo.subarbolIzdo());
            nodo.visitar();
            recorridoInOrden(nodo.subarbolDcho());
        }
    }

    public void recorridoPreOrden(Nodo nodo) {
        if (nodo != null) {
            nodo.visitar();
            recorridoPreOrden(nodo.subarbolIzdo());
            recorridoPreOrden(nodo.subarbolDcho());
        }
        
    }
	
    public void imprimirInOrden() {
        JOptionPane.showMessageDialog(null, "Recorrido en orden");
        recorridoInOrden(raiz);
    }
    
    public void imprimirPostOrden() {
        JOptionPane.showMessageDialog(null, "Recorrido post orden");
        recorridoPostOrden(raiz);
    }
    
    public void imprimirPreOrden() {
        JOptionPane.showMessageDialog(null, "Recorrido pre orden");
        recorridoPreOrden(raiz);
    }
    
    public Nodo insertar(Object dato, Nodo nodo) {
        if (nodo == null) {
            return new Nodo(dato, null, null);
        }
        if ((int) dato < (int) nodo.valorNodo()) {
            nodo.ramaIzdo(insertar(dato, nodo.subarbolIzdo()));
        } else {
            nodo.ramaDcho(insertar(dato, nodo.subarbolDcho()));
        }
        
        return nodo;
    }
    
    public void imprimirInsetar(Object dato) {
    	raiz = insertar(dato,raiz);
    }
    
    public int sumarNodo(Nodo nodo) {
    	if(nodo == null){
    		return 0;
    	}else{
    		int sumaIzquierda = sumarNodo(nodo.subarbolIzdo());
            int sumaDerecha = sumarNodo(nodo.subarbolDcho());
            return (int) nodo.valorNodo() + sumaIzquierda + sumaDerecha;
    	}
    }
	
    public int imprimirSuma() {
    	return sumarNodo(raiz);
    }
    
    public int tamano(Nodo nodo){
    	if(nodo == null) {
    		return 0;
    	}
    	int tamañoIzdo =tamano(nodo.subarbolIzdo());
    	int tamañoDcho =tamano(nodo.subarbolDcho());
    	
    	return 1 + tamañoIzdo + tamañoDcho;
    }
    
    public int imprimirTamano() {
    	return tamano(raiz);
    }
    
    public boolean vacio() {
    	return raiz == null;
    }
    
    public Nodo obtRaiz() {
    	return raiz;
    }
    
    public Nodo obtRamaIzdo() {
    	if(raiz != null) {
    		return raiz.subarbolIzdo();
    	}
    	return null;
    }
    
    public Nodo obtRamaDcho() {
    	if(raiz != null) {
    		return raiz.subarbolDcho();
    	}
    	return null;
    }
	
}
