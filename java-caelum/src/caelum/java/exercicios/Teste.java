package caelum.java.exercicios;

public class Teste {
	public static void main(String[] args) {
		AreaCalculavel a = new Retangulo(2, 3);
		System.out.println(a.calculaArea());
		
		AreaCalculavel b = new Quadrado(5);
		System.out.println(b.calculaArea());
		
		AreaCalculavel c = new Circulo(2.13);
		System.out.println(c.calculaArea());
		
	}

}
