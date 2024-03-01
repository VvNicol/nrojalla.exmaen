package servicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import dtos.productoDto;

/**
 * @author csi23-nrojlla 01032024
 */
public class EmpleadoImplementacion implements EmpleadoInterfaz {

	Scanner sc = new Scanner(System.in);

	@Override
	public void CalculoTotalDiario(List<productoDto> productoLista) {

		if (productoLista.size() > 0) {

			System.out.println("Ingrese una fecha formato(dd-MM-yyyy)");
			String Ingresefecha = sc.nextLine();
			for (productoDto producto : productoLista) {

				if (producto.getFechaCompra().equals(Ingresefecha)) {

					int sumar2 = +producto.getCosteProducto();
					String fecha = Ingresefecha;

					DateTimeFormatter formato = DateTimeFormatter.ofPattern("hh:mm:ss");

					fecha = fecha.format(Ingresefecha, formato);

					System.out.println("Total: " + sumar2);
					System.out.println("Minutos: " + fecha);

				}

			}
		}

	}

	@Override
	public void AgregarVenta(List<productoDto> productoLista) {

		long id = nuevoID(productoLista);
		System.out.println("Inserte el nombre del producto");
		String nombre = sc.nextLine();
		System.out.println("Inserte el nombre del producto");
		int coste = sc.nextInt();
		sc.next();
		LocalDate fecha = LocalDate.now();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
		String fechaCompra = fecha.format(formato);

		productoDto nuevaVenta = new productoDto(id, nombre, coste, fechaCompra);
		productoLista.add(nuevaVenta);
	}

	private long nuevoID(List<productoDto> productoLista) {

		long nuevoId;
		int tamanioLista = productoLista.size();
		if (productoLista.size() > 0) {
			nuevoId = 1;
		} else {

			nuevoId = productoLista.get(tamanioLista - 1).getId() + 1;
		}

		return nuevoId;
	}

}
