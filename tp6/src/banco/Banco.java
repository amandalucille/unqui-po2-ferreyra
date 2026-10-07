package banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List <Cliente> clientes;
	private List<SolicitudCredito> solicitudes;
	
	public Banco() {
		this.clientes = new ArrayList<Cliente>();
		this.solicitudes = new ArrayList<SolicitudCredito>();
		
	}
	
	public void addCliente(Cliente unCliente) {
		this.clientes.add(unCliente);
	}
	public Double calcularDesembolso() {
		return this.solicitudes.stream()
							   .filter(SolicitudCredito :: esAceptable)
							   .mapToDouble(SolicitudCredito:: getMontoSolicitud)
							   .sum();
	}		
	
	public void registrarSolicitud(SolicitudCredito solicitud) {
		this.solicitudes.add(solicitud);
	}
		
}
