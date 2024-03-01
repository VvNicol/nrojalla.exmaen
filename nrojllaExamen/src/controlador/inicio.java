/**
 * 
 */
package controlador;

import servicios.MenuImplementacion;
import servicios.MenuInterfaz;

/**
 * 
 */
public class inicio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuInterfaz mi = new MenuImplementacion();

		int opcionSeleccionada;
		boolean isCerrado = false;

		do {
			opcionSeleccionada = mi.MenuPrincipal();

			switch (opcionSeleccionada) {

			case 0:
				System.out.println("Menu cerrado");
				isCerrado = true;
				break;
			case 1:
				mi.MenuEmpleado();
				break;
			case 2:
				mi.MenuAgencia();
				break;

			default: 
				System.out.println("La opcion seleccionada no existe");

			}

		} while (!isCerrado);

	}

}
