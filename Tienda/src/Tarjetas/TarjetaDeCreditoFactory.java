package Tarjetas;

public class TarjetaDeCreditoFactory {
	private TarjetaDeCredito tarjeta;
	
	public TarjetaDeCredito createTarjeta(Cliente cliente) {
		if((cliente.getTiempoCreacionCuentaBancaria()>3) && (cliente.getIngresosMensuales()>10000)&& (cliente.getExperienciaCrediticia()>20)) {
			tarjeta=new TarjetaVIP();
			return tarjeta;	
		}
		
		if((cliente.getTiempoCreacionCuentaBancaria()<3) &&(cliente.getIngresosMensuales()<10000)) {
			tarjeta=new TarjetaPremium();
			return tarjeta;
		}else{
			tarjeta=new TarjetaBasica();
			return tarjeta;
		}
	}
}


