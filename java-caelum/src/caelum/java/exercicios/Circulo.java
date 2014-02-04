package caelum.java.exercicios;

public class Circulo implements AreaCalculavel {
	private double raio;

	public Circulo(double raio){
		this.raio = raio;
	}
	
	public double calculaArea(){
		return Math.PI * this.raio * this.raio;
	}

}
