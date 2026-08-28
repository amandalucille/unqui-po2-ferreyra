package tp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Empresa{
    
	 private String nombre;
	 private String cuit;
	 private List<Empleado> empleados;
	 private List<ReciboDeHaberes> recibos;
	 
	 public Empresa(String nombre, String cuit){
	     this.nombre = nombre;
	     this.cuit = cuit;
	     this.recibos = new ArrayList<>();
	     this.empleados = new ArrayList<>();
	 }
	 public double totalNeto(){
	     return empleados.stream()
	    		 		 .mapToDouble(Empleado::sueldoNeto).sum();
	 }
	 public double totalBruto(){
	     return empleados.stream()
	            .mapToDouble(Empleado::sueldoBruto).sum();
	 }
	    public double totalRetenciones(){
	     return empleados.stream()
	            .mapToDouble(Empleado::retenciones).sum();
	 }
	 public void liquidarSueldos(){
		 LocalDate fechaEmision = LocalDate.now();
		 List<ReciboDeHaberes> nuevosRecibos = this.empleados.stream()
				 											 .map(empleado -> empleado.generarRecibo(fechaEmision))
				 											 .toList();
		 this.recibos.addAll(nuevosRecibos);
	 }		 
}	 