package trabajador;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IngresoHsExtraTest {

		private IngresoHsExtra hsExtrasFebrero;
		
		
		@BeforeEach
		public void setUp() {
			hsExtrasFebrero= new IngresoHsExtra("Extra","Febrero", 45d,8d);
		}
		
		@Test
		public void testConstructor() {
			assertEquals(45d, hsExtrasFebrero.monto);
			assertEquals(0d, hsExtrasFebrero.getMontoImponible()); 
				
		}
}

