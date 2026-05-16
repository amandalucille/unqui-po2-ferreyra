package trabajador;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class TrabajadorTest {
	private Trabajador valen;

	private Ingreso sueldoFebrero;
	
	private IngresoHsExtra hsExtrasFebrero;
	
	
	@BeforeEach
	public void septUp() {
		
		valen = new Trabajador();
		
		sueldoFebrero = new Ingreso("Sueldo","Febrero", 90d);


		
		valen.addIngreso(sueldoFebrero);
		valen.addIngreso(hsExtrasFebrero);
	}
	@Test
	public void testTrabajador() {
		assertEquals(135d,valen.getTotalPercibido());
		assertEquals(90d,valen.getMontoImponible());
		assertEquals(1.8d,valen.getImpuestoAPagar());
		
	
	}
	
}
