package tp2;

import java.time.LocalDate;
import java.util.List;


public class ReciboDeHaberes{
    
    private String nombre;
    private String direccion;
    private LocalDate fechaEmision;
    private Double sueldoBruto;
    private Double sueldoNeto;
    private List<Concepto> conceptos;
    
    public ReciboDeHaberes(String nombre, String direccion, LocalDate fecha, Double bruto, Double neto, List<Concepto> conceptos){
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaEmision = fecha;
        this.sueldoBruto = bruto;
        this.sueldoNeto = neto;
        this.conceptos = conceptos;
    }

    public List<Concepto> getConceptos() {
        return this.conceptos;
    } 
}