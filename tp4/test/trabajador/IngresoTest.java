package trabajador;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class IngresoTest {
	private Ingreso sueldoEnero;

	@BeforeEach
	public void setUp() {
		sueldoEnero = new Ingreso("Sueldo", "Enero", 100d);
		
	}
	
	@Test
	public void testConstructor() {
		assertEquals(100d, sueldoEnero.getMontoImponible()); 
		
	}
}

