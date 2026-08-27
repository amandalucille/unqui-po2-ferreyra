package tp2;

import java.time.LocalDate;
import java.util.List;

public abstract class Empleado{
    private String nombre;
    private String direccion;
    private boolean tieneConyuge;
    private LocalDate fechaDeNacimiento;
    private double sueldoBasico;
    
    public Empleado(String nombre, String direccion,boolean tieneConyuge,LocalDate fechaDeNacimiento, double sueldoBasico){
        this.nombre = nombre;
        this.direccion = direccion;
        this.tieneConyuge = tieneConyuge;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.sueldoBasico = sueldoBasico;
    }
    public double sueldoBasico(){
        return this.sueldoBasico;
    }
    public abstract double obraSocial();
    public abstract double aportes();
    public abstract double sueldoBruto();
    public abstract List<Concepto> desgloceDeConceptos();
    
    public int edad(){
        return LocalDate.now().getYear() - this.fechaDeNacimiento.getYear(); 
        
    }
    
    public double sueldoNeto(){
        return this.sueldoBruto() - this.retenciones();
    }
    public double retenciones(){
        return this.obraSocial() + this.aportes();
    }
}
