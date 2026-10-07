package banco;

import java.time.LocalDate;
import java.time.Period;

public class Cliente {
	private String nombre;
	private String apellido;
	private String direccion;
	private LocalDate fechaDeNacimiento;
	private double sueldoNetoMensual;
	
	public Cliente(String nombre, String apellido,String direccion,LocalDate fecha, 
			double sueldoNM) {
		this.nombre = nombre;
		this.apellido= apellido;
		this.direccion = direccion;
		this.fechaDeNacimiento= fecha;
		this.sueldoNetoMensual= sueldoNM;
		
	}
	public double getSueldoNetoAnual() {
		return 12* sueldoNetoMensual;
	}
	public double getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}
	public int getEdad() {
		return Period.between(this.fechaDeNacimiento, LocalDate.now()).getYears();
	}
	
}
