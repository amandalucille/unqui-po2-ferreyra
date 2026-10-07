package banco;

public abstract class SolicitudCredito {
	
	private Cliente cliente;
	private double montoSolicitud;
	private int cuotas;
	
	public SolicitudCredito(Cliente cliente, double montoSolicitado, int cuotas) {
		this.cliente = cliente;
		this.montoSolicitud= montoSolicitado;
		this.cuotas= cuotas;
		
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	public double getMontoSolicitud() {
		return montoSolicitud;
	}
	public double calcularMontoMensual() {
		return getMontoSolicitud() / cuotas;
	}
	
	public abstract boolean esAceptable();
	
	public int getCuotas() {
		return cuotas;
	}
}