package caelum.java.exercicios;

public class ConvertStringToInteger {
	private String word;
	
	public int[] convertStringToInteger(String word){
		this.word = word;
		int [] number = new int[this.word.length()];
		for(int i = 0; i < this.word.length(); i++){
			number[i] = this.word.charAt(i) - '0';		
		}		
		return number;
	}

	public static void main(String[] args) {
		ConvertStringToInteger c = new ConvertStringToInteger();
		int [] number = c.convertStringToInteger("762");
		for(int i = 0; i < number.length; i++){
			System.out.print(number[i]);
		}
		
		
	}
	
}
