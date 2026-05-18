package mercadoCentral;

public class ProductoTrad extends Producto{
	
	public ProductoTrad(Double precio, int stock) {
		super(precio, stock);
	
	}
	
	@Override
	public Double getPrecio() {
		return super.getPrecioBase();
	}

}	
