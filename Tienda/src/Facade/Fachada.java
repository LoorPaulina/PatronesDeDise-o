package Facade;

public class Fachada {
	public void extraerOpcionUsuario() {
		//obtiene la opcion elegida por el usuario y lo redirecciona a los subsistemas
		switch(Opcion){
			case "Web":
				Web.realizarAtencionWeb();
			case "Movil":
				Movil.realizarAtencionMovil();
			case "Telefono":
				Telefono.realizarAtencionTelefonica();
		}
	
	}
}

