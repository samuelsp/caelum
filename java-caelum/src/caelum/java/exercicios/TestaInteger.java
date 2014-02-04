package caelum.java.exercicios;

import java.io.PrintStream;
import java.lang.Integer;

public class TestaInteger {
	public static void main(String[] args) {
		Integer x1 = new Integer("10");
		Integer x2 = new Integer("10");

		if (x1.equals(x2))
			System.out.println("São iguais.");
		else
			System.out.println("Não são iguais.");

		System.out.println(x1);

		String x3 = "o";
		try {
			int x4 = Integer.parseInt(x3);
			System.out.println(x4);
		} catch (NumberFormatException n) {
			System.out
					.println("Não foi possível converter o caractere para inteiro.");
		}
		
		PrintStream saida = System.out;
		saida.println("olá");

	}

}
