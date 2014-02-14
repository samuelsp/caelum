package caelum.java.exercicios;

//import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {
	public static void main(String[] args) {
		System.out.println("Iniciando...");
		Collection<Integer> teste = new HashSet<>();
		long inicio = System.currentTimeMillis();
				
		int total = 30000;
		for (int i = 0; i < total; i++) {
			teste.add(i);			
		}
		
		long fimInserir = System.currentTimeMillis();
		System.out.println("Tempo gasto para inserir: "+(fimInserir-inicio));
		
		for (int j = 0; j < total; j++) {
			teste.contains(j);			
		}
		
		long fimBuscar = System.currentTimeMillis();
		System.out.println("Tempo gasto para buscar: "+(fimBuscar-inicio));
		
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Tempo gasto total: "+tempo);
		
		
	}

}
