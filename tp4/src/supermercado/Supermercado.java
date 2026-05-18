package supermercado;
import java.util.List;     
import java.util.ArrayList;

public class Supermercado {
		
		private String nombre;
		
		private String direccion;
		
		private List<Producto> productos = new ArrayList<Producto>();

		public Supermercado(String nombre, String direccion) { // constructor 
			this.nombre = nombre;
			this.direccion = direccion;

		}
		
		public String getDireccion() {
			return direccion;
		}
		public String getNombre() {
			return nombre;
		}

		public int getCantidadDeProductos() {
			return this.productos.size(); 
		}

		public Double getPrecioTotal() {
			double total = 0;
			for (Producto p : this.productos) {
				total+= p.getPrecio();
			}
			return total;
		}

		public void agregarProducto(Producto producto) {
			this.productos.add(producto);
			}
		}