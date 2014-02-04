package caelum.java.exercicios;

public class Caracteres {
	private StringBuilder string;
	
	public Caracteres(){};
	
	public Caracteres(StringBuilder string){
		this.string = string;		
	}
	
	public StringBuilder reverseString(){
		return this.string.reverse();
	}
	
	public void retornaLinhaCaractere(String word) {
		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
	}

	public String deTrasParaFrente(String word) {
		String deTrasParaFrente = "";
		for (int j = word.length() - 1; j >= 0; j--) {
			deTrasParaFrente += word.charAt(j);
		}
		return deTrasParaFrente;
	}

	public String ordemInvertida(String phrase) {
		String ordemInvertida = "";
		String[] temp = phrase.split(" ", phrase.length() - 1);
		for (int l = temp.length - 1; l >= 0; l--) {
			ordemInvertida += temp[l] + " ";
		}
		return ordemInvertida;
	}

	public static void main(String[] args) {
		Caracteres ch = new Caracteres();
		Caracteres chs = new Caracteres(new StringBuilder("Socorram-me, subi no ônibus em Marrocos."));
		System.out.println(chs.reverseString());
		
		ch.retornaLinhaCaractere("happyness");
		System.out.println(ch
				.deTrasParaFrente("Socorram-me, subi no ônibus em Marrocos."));
		System.out.println(ch.deTrasParaFrente("anotaram a data da maratona"));
		System.out.println(ch
				.ordemInvertida("Socorram-me, subi no ônibus em Marrocos"));

	}

}
