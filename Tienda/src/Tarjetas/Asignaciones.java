package Tarjetas;

public class Asignaciones {

	
	private void asignarTarjeta(Cliente cliente) {
		TarjetaDeCreditoFactory factory= new TarjetaDeCreditoFactory();
		cliente.setTarjeta(factory.createTarjeta(cliente));
	}
}


