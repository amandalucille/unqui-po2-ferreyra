package supermercado;

public class Producto {
	private String nombre;
	private Double precio;
	private Boolean esPrecioCuidado = false;  
	
	
	public Producto(String nombre, double precio) { // constructor 
        this.nombre = nombre;
        this.precio = precio;
    }
	
	public Producto(String nombre, double precio, Boolean esCuidado) { // constructor
        this.nombre = nombre;
        this.precio = precio;
        this.esPrecioCuidado = esCuidado;
        
    }	
	
	public Boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}


	
	public String getNombre() {
		return nombre;
	}

	
	
	public double getPrecio() {
		return this.precio;
	}
	
	public void aumentarPrecio(double aumento) {
		this.precio += aumento; 
	}
	
}

