package mercadoCentral;
import java.util.List;
import java.util.ArrayList;


public class Caja {
	
	private List<Producto> productosRegistrados;

	
	
	public Caja() {
		 this.productosRegistrados = new ArrayList<Producto>();
	}
	
	public void registrarProducto(Producto producto) {
		if (producto.getStock() <= 0) {
	        throw new IllegalArgumentException("No hay stock del producto");
	    }
		producto.decrementarStock();
		this.productosRegistrados.add(producto);
	}
	
	
	public Double montoTotal() {
		Double total = 0d;
		for (Producto p : this.productosRegistrados) {
			total+= p.getPrecio();
		}
		return total;
	}
	
	public void limpiarCaja() {
		this.productosRegistrados.clear();
	}
	
	
}
