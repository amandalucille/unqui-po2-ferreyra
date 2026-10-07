package banco;

public class SolicitudCreditoPersonal extends SolicitudCredito {

	public SolicitudCreditoPersonal(Cliente cliente, double monto, int cuotas) {
		super(cliente, monto, cuotas);
		
	}
	@Override
	public boolean esAceptable() {
		Cliente cliente =  getCliente();
		
		return (cliente.getSueldoNetoAnual() >= 15000) &&
				calcularMontoMensual() <=  cliente.getSueldoNetoMensual() * 0.70;
				
	}
}
