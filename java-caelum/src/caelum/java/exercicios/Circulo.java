package caelum.java.exercicios;


//classe circulo que implementa a interface AreaCalculavel
public class Circulo implements AreaCalculavel {
	private double raio;

	public Circulo(double raio){
		this.raio = raio;
	}
	
	public double calculaArea(){
		return Math.PI * this.raio * this.raio;
	}

}
