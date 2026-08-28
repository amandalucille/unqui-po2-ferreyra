package tp2;

import java.time.LocalDate;
import java.util.List;

public class EmpleadoTemporaria extends Empleado {

	private LocalDate fechaFinDeDesignacion;
	private int cantHsExtra;
	
	public EmpleadoTemporaria(String nombre, String direccion, LocalDate fechaNacimiento, double sueldoBasico, LocalDate fechaFinDeDesignacion, int cantHsExtra){
        super(nombre, direccion, fechaNacimiento, sueldoBasico);
        this.fechaFinDeDesignacion = fechaFinDeDesignacion;
        this.cantHsExtra = cantHsExtra;
    }
	
	
	@Override
    public double sueldoBruto() {
    	return sueldoBasico() + horasExtra() ;
    }
	public double horasExtra() {
		return (cantHsExtra * 40);
	}
    
    @Override
    public double retenciones() {
    	return obraSocial() + aportes();
    }
    private double extraPorEdad() {
    	return (this.edad() > 50) ? 25 : 0 ;
    }
    private double aportesPorHorasExtra() {
    	return 25 * cantHsExtra;
    }
    
    @Override
    public double obraSocial() {
    	return 0.1 * sueldoBruto() + extraPorEdad();
    }
    @Override
    public double aportes() {
    	return sueldoBruto() * 0.1 + aportesPorHorasExtra();
    }


	@Override
	public List<Concepto> desgloceDeConceptos() {
		return List.of(
	            new Concepto("Sueldo Básico", this.sueldoBasico()),
	            new Concepto("Horas extras", this.horasExtra()),
	            new Concepto("Obra Social", this.obraSocial()),
	            new Concepto("Aportes Jubilatorios", this.aportes())
	        );
	}
}
