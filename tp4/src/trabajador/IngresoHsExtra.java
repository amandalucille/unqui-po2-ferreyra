package trabajador;

public class IngresoHsExtra extends Ingreso {
		public Double cantHsExtra;
	
	
	public IngresoHsExtra(String concepto, String mes, Double monto,Double cantHsExtra) {
		super(concepto, mes, monto);
		this.cantHsExtra= cantHsExtra;
	}

	public Double getMontoImponible() {
		return 0d;
		}
	
}
