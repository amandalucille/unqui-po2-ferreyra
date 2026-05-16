package Trabajador;

import java.util.ArrayList;
import java.util.List;

import supermercado.Producto;

public class Trabajador {
	
	
	//private Double totalPercibido;
	//private Double montoImponible;
	//private Double impuestoAPagar;
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
		 return total ;
	}
	
		
}

