package trabajador;

import java.util.ArrayList;
import java.util.List;

import supermercado.Producto;

public class Trabajador {
	
	
	public List<Ingreso> ingresos = new ArrayList<Ingreso>();
	
	public Double porcentajeDeImpuestoAPagar=2d; 
	
	public Trabajador() {
		
	}
	public Double getTotalPercibido() {
		Double total = 0d; 
		for (Ingreso i : this.ingresos) {
			 total+= i.monto;
		 }
		
		return  total;
	}
	
	public Double getImpuestoAPagar() {
				 
		return  this.getMontoImponible() * porcentajeDeImpuestoAPagar;
	}
	
	public Double getMontoImponible() {
		Double total = 0d; 
		for (Ingreso i : this.ingresos) {
			total += i.getMontoImponible();
		}
		return total;
	}
	
	public void addIngreso(Ingreso ingreso) {
		this.ingresos.add(ingreso);
	}
}

