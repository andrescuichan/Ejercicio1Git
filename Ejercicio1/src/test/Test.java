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
		

		System.out.println("Segundo Repositorio local");
		System.out.println("Prueba 2");

		System.out.println("Primer Repositorio local");
		System.out.println("Prueba 1");
		
		System.out.println("Conflicto Solucionado");

		
	}

}
