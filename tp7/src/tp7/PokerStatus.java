package tp7;
import java.util.Collections;
import java.util.List; 

public class PokerStatus {
		
	public PokerStatus() {}
/*	
 * punto 1
 * 
	public boolean verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
																			// aplico extraerValor a cada elemento a las cartas en mano.
		List<String> valores = List.of(carta1, carta2, carta3, carta4, carta5).stream()
																			  .map(this::extraerValor)
																			  .toList();

		// en la lista de valores de las cartas en mano hay algun numero que este al menos 4 veces?
		return valores.stream()
					  .anyMatch(v-> Collections.frequency(valores,v) >= 4);
	}
	// extraigo los valores, descartando el palo.
	public String extraerValor(String carta) {
		return carta.substring(0,carta.length() - 1);
		// entre 0 y la longitud menos 1, o sea siempre descartando el palo
	}*/
	
	//PUNTO2
	
	/*public String  verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
		List<String> mano = List.of(carta1, carta2, carta3, carta4, carta5);
		List<String> valores = mano.stream()
				  				   .map(this::extraerValor)
				  				   .toList();
				if (this.esPoker(valores)) {
					return "Poker";
				}
				if (this.esColor(mano)) {
					return "Color";
				}
				if (this.esTrio(valores)) {
					return "Trio";
				}
				return "Nada";		
		
	}*/
	public String  verificar(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {
		List<Carta> mano = List.of(c1, c2, c3, c4, c5);
		List<String> valores = mano.stream()
                				   .map(Carta::getValor)
                				   .toList();
		if (this.esPoker(valores)) {
			return "Poker";
		}
		if (this.esColor(mano)) {
			return "Color";
		}
		if (this.esTrio(valores)) {
			return "Trio";
		}
		return "Nada";
	}
		
	public boolean esPoker(List<String> valores) {
		
		return valores.stream()
				  	  .anyMatch(v-> Collections.frequency(valores,v) >= 4);	
	}
	public boolean esColor(List<Carta> mano) {
		boolean todasRojas = mano.stream()
								 .allMatch(this::esRoja);
		
		boolean todasNegras = mano.stream()
								  .allMatch(this::esNegra);
		
		return	todasRojas || todasNegras;
	}
	
	public boolean esTrio(List<String> valores) {
		return valores.stream()
	  	  .anyMatch(v-> Collections.frequency(valores,v) == 3);
	}
	
	public char extraerPalo(String carta) {
		return carta.charAt(carta.length() - 1);
	}
	public boolean esRoja(Carta carta) {
		char palo = carta.getPalo();
		return (palo == 'C' || palo == 'D');
	}
	public boolean esNegra(Carta carta) {
		char palo = carta.getPalo();
		return (palo == 'P' || palo == 'T');
	}
}
