package util;

public class Metodo {

	public static int[] impares(int[] numero) {

		int[] impar = new int[numero.length];
		int j = 0;
		for (int i = 0; i < numero.length; i++) {

			if (numero[i] % 2 != 0) {
				impar[j] = numero[i];
				j++;

			}
		}
		return impar;

	}

}
