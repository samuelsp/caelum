package caelum.java.exercicios;

//import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestaPerformanceDeAdicionarNaPrimeiraPosicao {
	public static void main(String[] args) {
		System.out.println("Iniciando...");
		long inicio = System.currentTimeMillis();
		
		List<Integer> teste = new LinkedList<>();
		
		for (int i = 0; i < 30000; i++) {
			teste.add(0, i);			
		}
		
		Iterator<Integer> i = teste.iterator();
		
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		long fim = System.currentTimeMillis();
		double tempo = (fim - inicio) / 1000.0;
		System.out.println("Tempo gasto: "+tempo);
		
	}

}
