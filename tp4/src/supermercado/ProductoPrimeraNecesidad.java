package supermercado;

public class ProductoPrimeraNecesidad extends Producto  {
		
		public ProductoPrimeraNecesidad(String nombre, Double precio,Boolean esPrecioCuidado) { // constructor 
			super(nombre,precio,esPrecioCuidado);
			
		}
		
		@Override
		public double getPrecio() {
			return super.getPrecio() * 0.9;
		}	
	}
