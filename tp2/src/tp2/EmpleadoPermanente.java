package tp2;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoPermanente extends Empleado{
    private int cantidadHijos;
    private int antiguedad;
    
    public EmpleadoPermanente(String nombre, String direccion, boolean tieneConyuge, LocalDate fechaNacimiento, double sueldoBasico,  int cantidadHijos, int antiguedad){
        
        super(nombre, direccion, tieneConyuge, fechaNacimiento, sueldoBasico);
        
        this.cantidadHijos = cantidadHijos;
        this.antiguedad = antiguedad;
    }
    public List<Concepto> desgloceDeConceptos(){
        List<Concepto> conceptos = new ArrayList<>();
        conceptos.add(new Concepto("Sueldo Básico",this.sueldoBasico())
        
        return 
    
}
   