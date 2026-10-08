package tp7;

public class Carta {
	private String valor;
	private char palo;
	
	public Carta(String valor, char palo) {
		this.valor = valor;
		this.palo = palo;
	}

	public boolean esMayorQue(Carta otraCarta){ 
		
		return this.getValorAInt() > otraCarta.getValorAInt();
	}
	
	public int getValorAInt() {
		if (this.getValor().equals("J")) {
			return 11;
		}
		if (this.getValor().equals("Q")) {
			return 12;
		}
		if (this.getValor().equals("K")) {
			return 13;
		}
		return Integer.parseInt(this.valor);
		
	}
	public String getValor() {
		return this.valor;
	}
	
	public boolean mismoPaloQue(Carta otraCarta) {
		return this.palo == otraCarta.getPalo();
		
	}
	public char getPalo() {
		return this.palo;
	}

}