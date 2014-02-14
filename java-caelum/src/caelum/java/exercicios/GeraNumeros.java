package caelum.java.exercicios;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class GeraNumeros {

	public static void main(String[] args) {
		Set<Integer> numeros = new TreeSet<>(Collections.reverseOrder());

		for (int i = 0; i <= 1000; i++) {
			numeros.add(i);
		}

		for (Integer i : numeros) {
			System.out.print(i + " ");
		}

	}

}
