package caelum.java.exercicios;

import br.com.caelum.banco.conta.Conta;
import br.com.caelum.banco.conta.ContaCorrente;
import br.com.caelum.banco.conta.ContaPoupanca;

public class TestaBanco {
	public static void main(String[] args) {
		Banco banco = new Banco();
		Conta c1 = new ContaCorrente();
		Conta c2 = new ContaPoupanca();
		Conta c3 = new ContaCorrente();
		
		c1.deposita(10000);
		c2.deposita(9000);
		c3.deposita(40000);
		
		c1.setNome("Maria Manoel da Silva");
		c2.setNome("João");
		c3.setNome("Paulo");
		
		banco.adiciona(c1);
		banco.adiciona(c2);
		banco.adiciona(c3);
		
		System.out.println(banco.pega(1));
		System.out.println(banco.pegaQuantidadeDeContas());
		System.out.println(banco.buscaPorNome("Maria Manoel da Silva"));
			
	}
		

}
