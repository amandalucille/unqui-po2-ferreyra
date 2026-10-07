package banco;

public class SolicitudCreditoHipotecario extends SolicitudCredito{
	
	private Garantia garantia;
	
	public SolicitudCreditoHipotecario(Cliente cliente, double monto, int cuotas, Garantia garantia) {
		super( cliente,  monto,  cuotas);
		this.garantia = garantia;
		
	}

	@Override
	public boolean esAceptable() {
		Cliente cliente = getCliente();
		return calcularMontoMensual() <= cliente.getSueldoNetoMensual() * 0.50 &&
				getMontoSolicitud() <= this.garantia.getValorFiscal() * 0.70 &&
				cliente.getEdad() + (getCuotas() / 12)  <= 65 ;
	}
}

