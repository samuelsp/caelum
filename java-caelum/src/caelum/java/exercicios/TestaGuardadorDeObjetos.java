package caelum.java.exercicios;

import br.com.caelum.banco.conta.*;

public class TestaGuardadorDeObjetos {
	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente();
		GuardadorDeObjetos g1 = new GuardadorDeObjetos();
		
		c1.deposita(200);
		g1.guardador(c1);		
		
		g1.guardador(5);
		
		Conta cp = (Conta) g1.recuperaObjeto(0);
		
		System.out.println(cp);
		System.out.println(g1.recuperaObjeto(1));
	}
}
