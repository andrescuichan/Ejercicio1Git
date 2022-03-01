package domain;

public class Suma {
	
	public int numero;
	
	public int SumaDosNumeros (int x, int y) {
		return x + y;
	}
	
	public int SumaIncremento (int x) {
		
		this.numero += x;
		return this.numero;
		
	}

}
