package caelum.java.exercicios;

public class GuardadorDeObjetos {
	private Object[] arrayGuardador = new Object[100];
	private int i = 0;

	public void guardador(Object o) {
		this.arrayGuardador[i] = o;
		i++;
	}

	public Object recuperaObjeto(int posicao) {
		return this.arrayGuardador[posicao];
	}

}
