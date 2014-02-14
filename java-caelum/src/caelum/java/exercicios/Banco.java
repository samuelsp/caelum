package caelum.java.exercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.caelum.banco.conta.Conta;

public class Banco {
	private List<Conta> contas = new ArrayList<>();
	private Map<String , Conta> nome = new HashMap<>();
	
	public void adiciona(Conta c){
		contas.add(c);
		nome.put(c.getNome(), c);
	}
	
	public Conta pega(int x){
		return contas.get(x);
	}

	public int pegaQuantidadeDeContas(){
		return contas.size();
	}
	
	public Conta buscaPorNome(String nome){
		return this.nome.get(nome);
		
	}
}
