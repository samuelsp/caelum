package caelum.java.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GeraNumerosArrayList {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		for (int i = 1; i <= 1000; i++) {
			numeros.add(i);
		}

		Collections.reverse(numeros);

		for (Integer n : numeros) {
			System.out.print(n + " ");
		}

	}

}
