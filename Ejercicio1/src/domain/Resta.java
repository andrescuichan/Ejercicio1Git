package domain;

public class Resta {
	public int numero;
	
	public int RestaDosNumeros (int x, int y) {
		return x - y;
	}
	
	public int RestaIncremento (int x) {
		
		this.numero -= x;
		return this.numero;
		
	}
}
