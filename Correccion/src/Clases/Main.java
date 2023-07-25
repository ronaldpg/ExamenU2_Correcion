package Clases;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		Arbol arbol = new Arbol();

		int opcion;
		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(
					"Selecciona una opción:\n" +
							"1. Recorrido en Orden\n" +
							"2. Recorrido PreOrden\n" +
							"3. Recorrido PostOrden\n" +
							"4. Insertar nuevo nodo\n" +
							"5. Sumar nodos\n" +
							"6. Tamaño del árbol\n" +
							"7. Salir"
					));

			switch (opcion) {
			case 1:
				arbol.imprimirInOrden();
				break;
			case 2:
				arbol.imprimirPreOrden();
				break;
			case 3:
				arbol.imprimirPostOrden();
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Insertando nodo 4,2 y 1");
				arbol.imprimirInsetar(4);
				arbol.imprimirInsetar(2);
				arbol.imprimirInsetar(1);
				break;
			case 5:
				int suma = arbol.imprimirSuma();
				JOptionPane.showMessageDialog(null, "La suma de los nodos es: " + suma);
				break;
			case 6:
				int tamano = arbol.imprimirTamano();
				JOptionPane.showMessageDialog(null, "El tamaño del árbol es: " + tamano);
				break;
			case 7:
				JOptionPane.showMessageDialog(null, "Saliendo del programa.");
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opción no válida. Inténtalo de nuevo.");
			}
		} while (opcion != 7);
	}
}
