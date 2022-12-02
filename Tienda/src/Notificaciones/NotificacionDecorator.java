package Notificaciones;

public abstract class NotificacionDecorator implements Notificacion{
	private Notificacion wrapee;
	
	public NotificacionDecorator(Notificacion notificacion) {
		this.wrapee= notificacion;	
	}
	
	public void enviar(String mensaje) {
		//envia el mensaje
	}
}
