package caelum.java.exercicios;

import java.math.BigDecimal;

public class NumerosGrandes {
	public static void main(String[] args) {
		Double n = (2 - Math.pow(2, -52)) - Math.pow(2, 1023);
		BigDecimal o = new BigDecimal(n);
		System.out.println(o);
	}

}
