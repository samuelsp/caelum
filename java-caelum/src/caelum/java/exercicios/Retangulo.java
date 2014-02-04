package caelum.java.exercicios;

public class Retangulo implements AreaCalculavel{
	private int largura;
	private int altura;
	
	public Retangulo(int largura, int altura){
		this.altura = altura;
		this.largura = largura;
	}
	
	public double calculaArea(){
		return this.largura * this.altura;
	}

}
