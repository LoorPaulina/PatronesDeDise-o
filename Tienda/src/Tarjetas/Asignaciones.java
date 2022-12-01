package Tarjetas;

public class Asignaciones {
	private TarjetaDeCredito tarjeta;
	
	private void asignarTarjetaCliente(Cliente cliente) {
		if((cliente.getTiempoCreacionCuentaBancaria()>3) && (cliente.getIngresosMensuales()>10000)&& (cliente.getExperienciaCrediticia()>20)) {
			tarjeta=new TarjetaVIP();
			cliente.setTarjeta(tarjeta);	
		}
		
		if((cliente.getTiempoCreacionCuentaBancaria()<3) &&(cliente.getIngresosMensuales()<10000)) {
			tarjeta=new TarjetaPremium();
			cliente.setTarjeta(tarjeta);
		}else{
			tarjeta=new TarjetaBasica();
			cliente.setTarjeta(tarjeta);
		}
	}
}
