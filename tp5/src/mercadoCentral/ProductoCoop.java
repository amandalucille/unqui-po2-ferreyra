package mercadoCentral;

public class ProductoCoop extends Producto {
	
	private int porcentajeDesc = 10; 
	
	public ProductoCoop(Double precio, int stock) {
		super(precio, stock);
	
	}
	@Override
	public Double getPrecio() {
		return super.getPrecioBase() * (1 - porcentajeDesc/100d);
	}

}
