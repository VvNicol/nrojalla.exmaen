/**
 * 
 */
package servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.agenciaDto;
import dtos.productoDto;

/**
 * @author csi23-nrojlla 01032024 menu de impletacion de metodos
 */
public class MenuImplementacion implements MenuInterfaz {

	List<productoDto> productoLista = new ArrayList<productoDto>();
	List<agenciaDto> agenciaLista = new ArrayList<agenciaDto>();
	Scanner sc = new Scanner(System.in);

	@Override
	public int MenuPrincipal() {

		System.out.println("-----------------");
		System.out.println("Menu Principal");
		System.out.println("0. Cerrar aplicacion");
		System.out.println("1. Menu empleado");
		System.out.println("2. Menu agencia");

		int opcionMenuP = sc.nextInt();

		return opcionMenuP;
	}

	@Override
	public void MenuEmpleado() {

		EmpleadoInterfaz ei = new EmpleadoImplementacion();

		int menuEmpleado = MenuEmpleadoMostrar();

		switch (menuEmpleado) {

		case 0:
			break;
		case 1:
			ei.CalculoTotalDiario(productoLista);
			break;
		case 2:
			ei.AgregarVenta(productoLista);
			break;

		default:
			System.out.println("La opcion seleccionada no existe");

		}

	}

	private int MenuEmpleadoMostrar() {

		System.out.println("-----------------");
		System.out.println("Menu Empleado");
		System.out.println("0. Volver");
		System.out.println("1. Cálculo total de ventas diario");
		System.out.println("2. Añadir venta");

		int opcionMenuE = sc.nextInt();

		return opcionMenuE;

	}

	@Override
	public void MenuAgencia() {

		AgenciaInterfaz ai = new AgenciaImplementacion();

		int menuAgencia = MenuAgenciaMostrar();

		switch (menuAgencia) {

		case 0:
			break;
		case 1:
			ai.MostrarVentasDelDia(agenciaLista);
			break;
		case 2:
			ai.NuevoPedido(agenciaLista);
			break;

		default:
			System.out.println("La opcion seleccionada no existe");

		}

	}

	private int MenuAgenciaMostrar() {

		System.out.println("-----------------");
		System.out.println("Menu Agencia");
		System.out.println("0. Volver");
		System.out.println("1. Mostrar ventas del dia");
		System.out.println("2. Nuevo pedido para proveedores");

		int opcionMenuA = sc.nextInt();

		return opcionMenuA;
	}

}
