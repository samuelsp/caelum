package caelum.java.exercicios;

public class TestaString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "fj11";
		s = s.replaceAll("1", "2");
		System.out.println(s);		
		
		//saber se uma string contém outra
		String v1 = "banana";
		String v2 = "c";
		System.out.println(v1.contains(v2)?"A variável v1 contém v2.":"A variável v1 não contém v2.");
		
		//quantos caracteres tem uma string
		int tamanhoV1 = v1.length();
		int tamanhoV2 = v2.length();
		System.out.printf("O tamanho de v1 e v2 respectivamente são: %d e %d.\n",tamanhoV1,tamanhoV2);
		
		//saber se uma string esta vazia
		String vazia = "";
		System.out.println(vazia.isEmpty()?"A string esta vazia.":"A string não esta vazia.");
		
		//retira espaços em branco do inicio e fim de frase
		String frase = "A camisa do rei de Ratopólis foi roida pelo rei de Veneza. ";
		frase = frase.trim();
		System.out.println(frase);
	
	}

}
