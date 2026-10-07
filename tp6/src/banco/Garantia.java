package banco;

public class Garantia {
	private String descripcion;
	private String direccion;
	private double valorFiscal;

	public Garantia(String descripcion, String direccion, double valor) {
		this.descripcion = descripcion;
		this.direccion= direccion;
		this.valorFiscal= valor;
	}
	public double getValorFiscal(){
		return valorFiscal;
	}
}
