package tp7Test;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.*;
import tp7.*;

public class PokerStatusTest {
	
	private PokerStatus pokerStatus;

	private Carta c1;
	private Carta c2;
	private Carta c3;
	private Carta c4;
	private Carta c5;
	
	
	@BeforeEach
	public void setUp() {
	this.pokerStatus = new PokerStatus(); // setUp
	
	this.c1 = mock(Carta.class);
	this.c2 = mock(Carta.class);
	this.c3 = mock(Carta.class);
	this.c4 = mock(Carta.class);
	this.c5 = mock(Carta.class);

	}
	/*
	@Test
	void testPokerConCartasSimples() { 
		String resultado = pokerStatus.verificar("KP", "KD", "KC", "2D", "KT"); // excercise
		assertEquals("Poker",resultado); // verify
	}
	@Test
	void testPokerConCartasDobles() {
		String resultado = pokerStatus.verificar("10P", "10D", "10C", "2D", "10T");
		assertEquals("Poker",resultado);
	}
	
	@Test
	void testPokerPrimeraPosicionDiferente() {
		String resultado = pokerStatus.verificar("10P", "2D", "2P", "2T", "2C");
		assertEquals("Poker",resultado);
	}
	
	/*@Test 															Punto1)
	void testCasiPoker() { 
		boolean resultado = pokerStatus.verificar("JP", "10D", "10C", "JD", "10T");
		assertFalse(resultado);
	}
	
	
	@Test 															
	void testColorRojo() { 
		String resultado = pokerStatus.verificar("KD","10C", "1D", "JD","QD" );
		assertEquals("Color",resultado);
	}
	@Test 															
	void testColorNegro() { 
		String resultado = pokerStatus.verificar("KP","1P", "1T", "JT","QP" );
		assertEquals("Color",resultado);
	}

	@Test 															
	void testTrioPrimerasCartas() { 
		String resultado = pokerStatus.verificar("10T","10C", "10D", "JD","QD" );
		assertEquals("Trio",resultado);
	}
	@Test 															
	void testTrioMezcladas() { 
		String resultado = pokerStatus.verificar("JP", "10D", "10C", "JD", "10T");
		assertEquals("Trio",resultado);	
		
	}
	@Test 
	void testNoEsPoker() {
		String resultado = pokerStatus.verificar("4P", "3P", "5P", "QP", "10D");
		assertEquals("Nada",resultado);
	}
	
	@Test
	void testManoPokerYTrioDevuelvePoker() {
		String resultado = pokerStatus.verificar("4P", "4T", "4D", "4C", "10T");
		assertEquals("Poker",resultado);
	}
	@Test
	void testManoDobleNoTrio() {
		String resultado = pokerStatus.verificar("3D", "3P", "2D", "2T", "QC");
		assertEquals("Nada",resultado);
	}
*/
	@Test
	void testPokerConCartasSimples() {
	when(c1.getValor()).thenReturn("7");
    when(c2.getValor()).thenReturn("7");
    when(c3.getValor()).thenReturn("7");
    when(c4.getValor()).thenReturn("2");
    when(c5.getValor()).thenReturn("7");
    
    
	String resultado = pokerStatus.verificar(c1, c2, c3, c4, c5); // excercise
	
	assertEquals("Poker",resultado); // verify
	}
	@Test
	void testPokerConCartasDobles() {
		when(c1.getValor()).thenReturn("10");
	    when(c2.getValor()).thenReturn("10");
	    when(c3.getValor()).thenReturn("10");
	    when(c4.getValor()).thenReturn("2");
	    when(c5.getValor()).thenReturn("10");
		
		String resultado = pokerStatus.verificar(c1,c2,c3,c4,c5);
		assertEquals("Poker",resultado);
	}
	@Test
	void testPokerPrimeraPosicionDiferente() {

		when(c1.getValor()).thenReturn("2");
	    when(c2.getValor()).thenReturn("K");
	    when(c3.getValor()).thenReturn("K");
	    when(c4.getValor()).thenReturn("K");
	    when(c5.getValor()).thenReturn("K");
		
		String resultado = pokerStatus.verificar(c1,c2,c3,c4,c5);
		assertEquals("Poker",resultado);
	}
	@Test 															
	void testColorRojo() { 
		when(c1.getPalo()).thenReturn('D');
	    when(c2.getPalo()).thenReturn('C');
	    when(c3.getPalo()).thenReturn('D');
	    when(c4.getPalo()).thenReturn('C');
	    when(c5.getPalo()).thenReturn('C');
	    when(c1.getValor()).thenReturn("2");
	    when(c2.getValor()).thenReturn("Q");
	    when(c3.getValor()).thenReturn("Q");
	    when(c4.getValor()).thenReturn("J");
	    when(c5.getValor()).thenReturn("J");
		
	    
		String resultado = pokerStatus.verificar(c1,c2,c3,c4,c5);
		assertEquals("Color",resultado);
	}
	@Test 															
	void testColorNegro() { 
		
		when(c1.getPalo()).thenReturn('T');
	    when(c2.getPalo()).thenReturn('P');
	    when(c3.getPalo()).thenReturn('T');
	    when(c4.getPalo()).thenReturn('T');
	    when(c5.getPalo()).thenReturn('P');
	    
	    when(c1.getValor()).thenReturn("2");
	    when(c2.getValor()).thenReturn("10");
	    when(c3.getValor()).thenReturn("Q");
	    when(c4.getValor()).thenReturn("J");
	    when(c5.getValor()).thenReturn("J");
		
	    
		String resultado = pokerStatus.verificar(c1,c2,c3,c4,c5);
		assertEquals("Color",resultado);
	}
	@Test 															
	void testTrioPrimerasCartas() { 
	    when(c3.getValor()).thenReturn("J");
	    when(c4.getValor()).thenReturn("J");
	    when(c5.getValor()).thenReturn("J");
	    when(c1.getValor()).thenReturn("2");
	    when(c2.getValor()).thenReturn("10");
	    
	    when(c1.getPalo()).thenReturn('D');
	    when(c1.getPalo()).thenReturn('T');
		
		String resultado = pokerStatus.verificar(c1,c2,c3,c4,c5);
		assertEquals("Trio",resultado);
	}
	@Test 															
	void testTrioMezcladas() { 
	    when(c1.getValor()).thenReturn("2");
	    when(c5.getValor()).thenReturn("J");
	    when(c4.getValor()).thenReturn("J");
	    when(c2.getValor()).thenReturn("10");
	    when(c3.getValor()).thenReturn("J");
		
	    when(c1.getPalo()).thenReturn('D');
	    when(c1.getPalo()).thenReturn('T');
	    
		String resultado = pokerStatus.verificar(c1,c2,c3,c4,c5);
		assertEquals("Trio",resultado);
	}
	@Test
	void testVerificarRetornaNada() {
		when(c1.getPalo()).thenReturn('T');
	    when(c2.getPalo()).thenReturn('P');
	    when(c3.getPalo()).thenReturn('D');
	    when(c4.getPalo()).thenReturn('C');
	    when(c5.getPalo()).thenReturn('P');
	    
	    when(c1.getValor()).thenReturn("2");
	    when(c2.getValor()).thenReturn("10");
	    when(c3.getValor()).thenReturn("Q");
	    when(c4.getValor()).thenReturn("J");
	    when(c5.getValor()).thenReturn("J");
		
		
		String resultado = pokerStatus.verificar(c1,c2,c3,c4,c5);
		assertEquals("Nada",resultado);
	}
	
}
	