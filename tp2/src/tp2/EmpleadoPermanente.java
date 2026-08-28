package tp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoPermanente extends Empleado{
    private int cantidadHijos;
    private int antiguedad;
    private boolean tieneConyuge;
    
    
    public EmpleadoPermanente(String nombre, String direccion, LocalDate fechaNacimiento, double sueldoBasico, boolean tieneConyuge, int cantidadHijos, int antiguedad){
        
        super(nombre, direccion, fechaNacimiento, sueldoBasico);
        this.tieneConyuge = tieneConyuge;
        this.cantidadHijos = cantidadHijos;
        this.antiguedad = antiguedad;
    }
    public double sueldoFamiliar() {
    	return asignacionPorHijo() + asignacionPorConyuge();
    }
    
    public double asignacionPorHijo() {
    	return cantidadHijos * 150;
    }
    
    public double asignacionPorConyuge() {
        return tieneConyuge ? 100 : 0;
    }
    
    @Override
    public List<Concepto> desgloceDeConceptos() {
        return List.of(
            new Concepto("Sueldo Básico", this.sueldoBasico()),
            new Concepto("Asignación por Hijo", this.asignacionPorHijo()),
            new Concepto("Asignación por Cónyuge", this.asignacionPorConyuge()),
            new Concepto("Antigüedad", this.montoAntiguedad()),
            new Concepto("Obra Social", this.obraSocial()),
            new Concepto("Aportes Jubilatorios", this.aportes())
        );
    }
    
    private double montoAntiguedad() {
		return 50 * this.antiguedad;
	}
    
    @Override
    public double retenciones() {
	return obraSocial() + aportes();
}

	@Override
	public double obraSocial() {

		return 0.1 * sueldoBruto() + (20 * this.cantidadHijos);
	}
	@Override
	public double aportes() {
		
		return 0.15 *sueldoBruto() ;
	}
	@Override
	public double sueldoBruto() {

		return sueldoBasico() + sueldoFamiliar() ;
	}
}