package trabajador;


	public class Ingreso {
		public String concepto;
		public String mesPercepcion;
		public Double monto;
	
	public Ingreso(String concepto, String mes, Double monto) { 
	        this.concepto = concepto;
	        this.mesPercepcion = mes;
	        this.monto = monto;
	    }	
	
	public Double getMontoImponible() {
		return this.monto;
		}
	
	}

	
	