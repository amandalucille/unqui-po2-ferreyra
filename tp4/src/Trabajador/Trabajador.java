package Trabajador;

import java.util.ArrayList;
import java.util.List;

import supermercado.Producto;

public class Trabajador {
	
	//private Double impuesto;
	//private Double totalPercibido;
	//private Double montoImponible;
	//private Double impuestoAPagar;
	public List<Ingreso> ingresos = new ArrayList<Ingreso>();
	
	public Double porcentajeDeImpuestoAPagar; 
	
	public Trabajador() {
		
	}
	public Double getTotalPercibido() {
		 
		return  ;
	}
	
	public Double getImpuestoAPagar(Double montoImponible, Double porcentajeDeImpuestoAPagar) {
				 
		return montoImponible * (1 - porcentajeDeImpuestoAPagar);
	}
	
	
		
}

