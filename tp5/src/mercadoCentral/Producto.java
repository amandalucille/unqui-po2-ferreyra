package mercadoCentral;


public abstract class Producto {
	
	private Double precioBase;
	protected int stock;
	
	public Producto(Double precio, int stock) { // constructor 
		this.precioBase = precio;
		this.stock = stock;
	}
	public abstract Double getPrecio();
	
	
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public void incrementarStock() {
		this.stock += 1; 
	}
	public void decrementarStock() {
			this.stock -= 1;
	}
	public Double getPrecioBase() {
		return precioBase;
	}
}
