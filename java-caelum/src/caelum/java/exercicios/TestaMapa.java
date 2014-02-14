package caelum.java.exercicios;

import java.util.HashMap;
import java.util.Map;
import br.com.caelum.banco.conta.Conta;
import br.com.caelum.banco.conta.ContaCorrente;

public class TestaMapa {
	public static void main(String[] args) {
		Conta c1 = new ContaCorrente();
		c1.deposita(10000);
		
		Conta c2 = new ContaCorrente();
		c2.deposita(3000);
		
		Map<String, Conta> mapaDeContas = new HashMap<String, Conta>();
		
		mapaDeContas.put("diretor", c1);
		mapaDeContas.put("gerente", c2);
		
		Conta contaDoDiretor = mapaDeContas.get("diretor");
		System.out.println(contaDoDiretor.getSaldo());
		
		Conta contaDoGerente = mapaDeContas.get("gerente");
		System.out.println(contaDoGerente.getSaldo());			
		
	}

}
