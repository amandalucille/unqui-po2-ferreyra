package supermercado;

public class ProductoPrimeraNecesidad extends Producto  {
		
		//public Double porcentajeDeDescuento = 10.0; (punto1)
		public Double porcentajeDeDescuento; 
		
		public ProductoPrimeraNecesidad(String nombre, Double precio,Boolean esPrecioCuidado, Double descuento) { // constructor 
			super(nombre,precio,esPrecioCuidado);
			
			this.porcentajeDeDescuento = descuento;
		}
		
		@Override
		public double getPrecio() {
			return super.getPrecio() * (1 - porcentajeDeDescuento/100);
		}	
	}
