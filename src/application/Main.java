package application;

import util.Metodo;

public class Main {
	public static void main(String[] args) {

		int[] entrada = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] saida = new int[5];
		saida = Metodo.impares(entrada);
		for (int i = 0; i < saida.length; i++) {
			if (saida[i] == 0) {
				continue;
			}
			System.out.println(saida[i]);
		}
	}

}
