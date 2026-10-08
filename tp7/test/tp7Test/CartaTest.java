package tp7Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import tp7.*;
public class CartaTest {
	
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;

	
	@BeforeEach
	public void setUp() { 
		carta1 = new Carta("K",'P');
		carta2 = new Carta("10",'T');
		carta3 = new Carta("1",'P');
		carta4 = new Carta("K",'C');
		carta5 = new Carta("9",'D');
	}
	
	@Test
	void testCartaEsMayorQueOtra() {
		assertTrue(carta1.esMayorQue(carta2));
		
	}
	@Test
	void testCartaEsMenorQueOtra() {
		assertFalse(carta2.esMayorQue(carta1));
	}
	@Test
	void testCartaSimpleEsMayorQueOtra() {
		assertTrue(carta5.esMayorQue(carta3));
		
	}
	@Test
	void testCartasDeIgualValor() {
		assertFalse(carta1.esMayorQue(carta4));
	}
	
	@Test
	void testCartasDelMismoPalo() {
		assertTrue(carta1.mismoPaloQue(carta3));
	}
	@Test
	void testCartasDiferentePalo() {
		assertFalse(carta2.mismoPaloQue(carta3));
	}
}
