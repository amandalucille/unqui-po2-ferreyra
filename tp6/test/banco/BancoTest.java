package banco;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class BancoTest {
	private Banco santander;
	
	private Cliente clienteApto;
	private Cliente clienteSueldoBajo ;
	private Cliente clienteAlLimiteEdad ;

	private Garantia garantiaSuficiente;
	Garantia garantiaInsuficiente;
	
	private SolicitudCreditoPersonal solicitudPersonalApto;
	private SolicitudCreditoPersonal solicitudPersonalSueldoAnual;
	private SolicitudCreditoPersonal solicitudPersonalCuotaSueldo;
	
	private SolicitudCreditoHipotecario solicitudHipotecarioApto;
	private SolicitudCreditoHipotecario solicitudHipotecarioCuotaSueldo;
	private SolicitudCreditoHipotecario solicitudHipotecarioFallaGarantia;
	private SolicitudCreditoHipotecario solicitudHipotecarioFallaEdad;
	
	
	
	
	
	@BeforeEach
	public void setUp() {
		santander = new Banco();
		
		clienteApto = new Cliente("Juan", "Perez", "Calle 1", LocalDate.of(1996, 5, 10), 100000d);
		clienteSueldoBajo = new Cliente("Ana", "Gomez", "Calle 2", LocalDate.of(2001, 8, 20), 1000d);
		clienteAlLimiteEdad = new Cliente("Carlos", "Lopez", "Rivadavia 200", LocalDate.of(1966, 3, 15), 100000d);

		garantiaSuficiente = new Garantia("Casa", "San Martín 100", 10000000d);
		garantiaInsuficiente= new Garantia("Terreno", "Calle sin salida", 100000.0);

		solicitudPersonalApto = new SolicitudCreditoPersonal(clienteApto, 50000d, 12);
		solicitudPersonalSueldoAnual = new SolicitudCreditoPersonal(clienteSueldoBajo, 2000.0, 6);
		solicitudPersonalCuotaSueldo = new SolicitudCreditoPersonal(clienteApto, 800000.0, 10);

		solicitudHipotecarioApto = new SolicitudCreditoHipotecario(clienteApto, 1000000d, 120, garantiaSuficiente);
		solicitudHipotecarioCuotaSueldo = new SolicitudCreditoHipotecario(clienteApto, 600000.0, 10, garantiaSuficiente);
		solicitudHipotecarioFallaGarantia = new SolicitudCreditoHipotecario(clienteApto, 200000.0, 120, garantiaInsuficiente);
		solicitudHipotecarioFallaEdad = new SolicitudCreditoHipotecario(clienteAlLimiteEdad, 500000.0, 120, garantiaSuficiente);
		
	}
	@Test
	void calcularDesembolso() {
		santander.addCliente(clienteApto);
		santander.addCliente(clienteSueldoBajo);
		santander.addCliente(clienteAlLimiteEdad);
		
		santander.registrarSolicitud(solicitudPersonalApto);
		santander.registrarSolicitud(solicitudPersonalSueldoAnual);
		santander.registrarSolicitud(solicitudPersonalCuotaSueldo);
		santander.registrarSolicitud(solicitudHipotecarioApto);
		santander.registrarSolicitud(solicitudHipotecarioCuotaSueldo);
		santander.registrarSolicitud(solicitudHipotecarioFallaGarantia);
		santander.registrarSolicitud(solicitudHipotecarioFallaEdad);
		
		assertEquals(1050000d,santander.calcularDesembolso());
		
	}
}