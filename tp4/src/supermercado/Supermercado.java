package supermercado;
import java.util.List;     
import java.util.ArrayList;

public class Supermercado {
		private String nombre;
		private String direccion;
		private List<Producto> productos = new ArrayList<>();
		
	
public Supermercado(String nombre, String direccion) { // constructor básico
    this.nombre = nombre;
    this.direccion = direccion;
	
	}
public int getCantidadDeProductos(List<Producto> producto) {
	return productos.size(); 
	}



public void agregarProducto(Producto producto) {
	this.productos.add(producto);
	}
}