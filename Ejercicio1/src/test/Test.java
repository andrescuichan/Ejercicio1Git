package test;

import domain.*;

public class Test {

	public static void main(String[] args) {
		System.out.println("Suma");
		Suma operacion1 = new Suma();
		System.out.println(operacion1.SumaDosNumeros(12,6));
		System.out.println(operacion1.SumaDosNumeros(2,8));
		
		System.out.println(operacion1.numero);
		System.out.println(operacion1.SumaIncremento(4));
		System.out.println(operacion1.SumaIncremento(4));
		
		System.out.println("Resta");
		Resta operacion2 = new Resta();
		System.out.println(operacion2.RestaDosNumeros(12,6));
		System.out.println(operacion2.RestaDosNumeros(2,8));
		
		System.out.println(operacion2.numero);
		System.out.println(operacion2.RestaIncremento(4));
		System.out.println(operacion2.RestaIncremento(4));
		
		System.out.println("Nuevo commit 1 desde PrimeraRama");
		
	}

}
