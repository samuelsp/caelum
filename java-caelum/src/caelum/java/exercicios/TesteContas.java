package caelum.java.exercicios;

import java.util.HashSet;
import java.util.Set;

import br.com.caelum.banco.conta.Conta;
import br.com.caelum.banco.conta.ContaCorrente;

public class TesteContas {
	public static void main(String[] args) {
		Set<Conta> contas = new HashSet<>();
		Conta c1 = new ContaCorrente();
		Conta c2 = new ContaCorrente();
		Conta c3 = new ContaCorrente();

		c1.setNumero(1234);
		c1.deposita(1000);

		c2.setNumero(2345);
		c2.deposita(2000);

		c3.setNumero(1234);
		c3.deposita(3000);

		if (c1.equals(c3))
			System.out.println("São iguais.");
		else
			System.out.println("Não são iguais.");

		contas.add(c1);
		contas.add(c2);
		contas.add(c3);

		for (Conta conta : contas) {
			System.out.println(conta);
		}

	}

}
