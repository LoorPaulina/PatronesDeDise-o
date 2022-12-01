package Tarjetas;

public class Cliente {
	private int ingresosMensuales;
	private int experienciaCrediticia;
	private int tiempoCreacionCuentaBancaria;//tiempo en años
	private TarjetaDeCredito tarjeta;
	
	public int getIngresosMensuales() {
		return ingresosMensuales;
	}
	public void setIngresosMensuales(int ingresosMensuales) {
		this.ingresosMensuales = ingresosMensuales;
	}
	public int getExperienciaCrediticia() {
		return experienciaCrediticia;
	}
	public void setExperienciaCrediticia(int experienciaCrediticia) {
		this.experienciaCrediticia = experienciaCrediticia;
	}
	public int getTiempoCreacionCuentaBancaria() {
		return tiempoCreacionCuentaBancaria;
	}
	public void setTiempoCreacionCuentaBancaria(int tiempoCreacionCuentaBancaria) {
		this.tiempoCreacionCuentaBancaria = tiempoCreacionCuentaBancaria;
	}
	public TarjetaDeCredito getTarjeta() {
		return tarjeta;
	}
	public void setTarjeta(TarjetaDeCredito tarjeta) {
		this.tarjeta = tarjeta;
	}
	
	
	
	
}
